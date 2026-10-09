# ShopFlow

Plateforme backend d'une boutique en ligne, construite pas à pas comme projet
fil rouge du livre « Le Développeur Backend ».

## État d'avancement

Étape 0 en cours : cadrage et outillage. Pas encore de fonctionnalité.

## Démarrage

Pour lancer en local, éxécutez les commandes suivantes:

1. Copiez le fichier de configuration : `cp .env.example .env`
2. Démarrez les services de la base de données et du cache : `docker compose up -d`
3. Compilez, testez et vérifiez le projet : `mvn verify`


## Les trois applications

- shopflow-api : le coeur métier (comptes, catalogue, panier, commandes, paiement, stock)
- shopflow-notifications : envoi des e-mails et des factures
- shopflow-stats : statistiques de ventes
