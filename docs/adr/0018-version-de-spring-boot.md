# ADR-018 — Version de Spring Boot utilisée pour l'apprentissage

- **Date :** 2026-10-07
- **Statut :** accepté

## Contexte

Le livre et son code s'appuient sur Spring Boot 3.x. Or Spring Boot 3.5, dernière version de
la lignée 3.x, a **cessé de recevoir des correctifs de sécurité gratuits le 30 juin 2026**.
Les versions encore supportées sont Spring Boot 4.0 (jusqu'en décembre 2026) et 4.1. La
version 4 apporte des changements qui touchent le code du livre (noms de certains starters,
passage à Jackson 3, notamment).

## Décision

Pendant l'apprentissage, le projet utilise **Spring Boot 3.5.16** (dernière version de la
lignée 3.5) afin de rester strictement aligné sur le livre. Ce projet **ne doit pas être
déployé tel quel en production réelle**.

Une **migration vers Spring Boot 4.x** est prévue comme exercice bonus après l'étape 12 : la
mener soi-même est un excellent exercice, très recherché en entreprise.

## Alternatives écartées

- **Démarrer directement en Spring Boot 4.x :** possible, mais cela obligerait à gérer en
  même temps l'apprentissage des concepts et les différences entre versions, avec un code
  qui ne correspond plus au livre.

## Conséquences

- Dette technique enregistrée (D-001 dans `docs/dette-technique.md`).
- La version est définie à un seul endroit (`spring-boot.version` dans le `pom.xml`
  parent), ce qui facilitera la migration.
- Cette décision sera revue avant le tome 3.
