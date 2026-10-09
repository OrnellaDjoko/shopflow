# ADR-002 — PostgreSQL comme base de données de référence

- **Date :** 2026-10-07
- **Statut :** accepté

## Contexte

ShopFlow gère des commandes, des paiements et du stock. Il faut des **transactions
fiables**, des **contraintes** (unicité, valeur minimale), de bons **index** et une
**recherche textuelle** performante.

## Décision

PostgreSQL 16 est la base de données de référence, en développement comme en production.

## Alternatives écartées

- **MySQL :** tout à fait viable, mais moins riche pour la recherche plein texte et les
  index avancés dont nous aurons besoin.
- **MongoDB :** la souplesse du schéma ne nous sert à rien ici, et les règles de cohérence
  entre commandes et stock sont plus naturelles avec des transactions relationnelles.
- **H2 (base en mémoire) :** jamais utilisée pour les tests, car son comportement diffère de
  PostgreSQL (verrous, types, fonctions).

## Conséquences

- Les tests d'intégration utiliseront une vraie base PostgreSQL dans un conteneur
  (Testcontainers).
- Redis est ajouté à côté pour des besoins précis (cache, limitation de débit), pas comme
  base de référence.
