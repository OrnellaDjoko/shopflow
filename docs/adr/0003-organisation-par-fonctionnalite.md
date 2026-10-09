# ADR-003 — Organisation du code par fonctionnalité

- **Date :** 2026-10-07
- **Statut :** accepté

## Contexte

Il existe deux grandes façons de ranger le code d'une application : par **type technique**
(`controller/`, `service/`, `repository/`) ou par **fonctionnalité** (`catalogue/`,
`commande/`, `paiement/`).

## Décision

Dans `shopflow-api`, le code est rangé **par fonctionnalité**. Chaque dossier (`auth`,
`catalogue`, `panier`, `commande`, `paiement`, `stock`, `outbox`, `admin`, `common`) contient
ses propres contrôleurs, services, entités et dépôts.

## Alternatives écartées

- **Par type technique :** pratique pour un petit CRUD, mais les fichiers qui évoluent
  ensemble sont éparpillés, et il est difficile de voir où se trouvent les frontières
  métier.

## Conséquences

- Tout ce qui concerne le « panier » se trouve au même endroit.
- Extraire un module en service autonome (tome 3) sera bien plus simple.
- Il faudra empêcher les dépendances sauvages entre dossiers : règles ArchUnit à l'étape 12.
