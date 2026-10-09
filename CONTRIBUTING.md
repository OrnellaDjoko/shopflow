# Contribuer à ShopFlow

Même seul, on travaille comme en équipe : cela donne de bonnes habitudes.

## Les branches

- `main` : toujours **stable**. Le pipeline doit y être vert.
- Une branche **courte** par tâche, créée à partir de `main` : `feature/catalogue-recherche`,
  `fix/arrondi-total`, `docs/adr-stock`.
- On fusionne vite (en moins de deux jours si possible).

## Les messages de commit

Format : `type(portée): résumé court à l'impératif`

| Type | Quand l'utiliser | Exemple |
|------|------------------|---------|
| `feat` | Nouvelle fonctionnalité | `feat(commande): ajoute l'annulation d'une commande` |
| `fix` | Correction d'un bogue | `fix(panier): corrige le calcul du total` |
| `test` | Ajout ou correction de tests | `test(stock): ajoute le test de concurrence` |
| `docs` | Documentation seule | `docs(adr): documente le choix de Kafka` |
| `refactor` | Réécriture sans changer le comportement | `refactor(auth): extrait le service de jetons` |
| `build` | Maven, dépendances | `build: met à jour la version de Spring Boot` |
| `ci` | Pipeline d'intégration continue | `ci: ajoute l'analyse des dépendances` |
| `chore` | Tâche diverse | `chore: initialise le projet` |

Règles : un commit = une idée ; message clair en français ; jamais de mot de passe ni de
secret dans un commit.

## Avant de proposer un changement

- [ ] `mvn verify` réussit sur ma machine.
- [ ] J'ai écrit ou mis à jour les tests.
- [ ] Si j'ai pris une décision structurante, j'ai écrit un ADR (voir `docs/adr/`).
- [ ] Le code est mis en forme (`mvn spotless:apply`).

## Mise en forme du code

Le projet utilise Spotless avec le style Google. Si le build signale des erreurs de
format, lancez `mvn spotless:apply` : il corrige automatiquement.
