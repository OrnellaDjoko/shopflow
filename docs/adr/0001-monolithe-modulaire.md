# ADR-001 — Un monolithe modulaire pour le cœur métier

- **Date :** 2026-10-07
- **Statut :** accepté

## Contexte

ShopFlow est développé par une seule personne, dans un but d'apprentissage et de
démonstration. Il doit pouvoir démarrer en une commande. Les commandes et le stock exigent
une **cohérence forte** (jamais de survente, jamais de double paiement). Découper le système
en nombreux services ajoute des coûts : appels réseau, déploiements multiples, cohérence
difficile entre bases.

## Décision

Le cœur métier (comptes, catalogue, panier, commandes, paiement, stock) est **une seule
application**, `shopflow-api`, organisée en **modules internes** aux frontières claires.
Deux petites applications satellites existent à côté (`shopflow-notifications` et
`shopflow-stats`) parce que le traitement asynchrone y apporte un vrai bénéfice.

## Alternatives écartées

- **Microservices dès le départ :** trop de complexité pour le gain, surtout avant d'avoir
  compris le domaine.
- **Monolithe sans modules :** plus rapide au début, mais impossible à découper proprement
  plus tard.

## Conséquences

- Les transactions de base de données restent simples et fiables.
- Le démarrage et les tests sont rapides.
- Les modules pourront être extraits en services au tome 3.
- Il faudra de la discipline pour respecter les frontières : des règles automatiques
  (ArchUnit) seront ajoutées à l'étape 12.
