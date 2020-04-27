#### Projet agile <!-- omit in toc -->
# Serveur REST <!-- omit in toc -->

***Ce repo contient le code de l'API REST du projet agile. Cette API est interrogée par le [client android](https://gitlab.com/univlille/defi-agile-iut/skeleton/client-android) et le [client web](https://gitlab.com/univlille/defi-agile-iut/skeleton/client-web).***

Il est recommandé de lancer ce serveur **AVANT** de démarrer le setup des deux clients.

## Sommaire <!-- omit in toc -->
- [TL;DR](#tldr)
- [Setup du projet](#setup-du-projet)
	- [1. Installation](#1-installation)
	- [2. Lancement du serveur pour les tests](#2-lancement-du-serveur-pour-les-tests)
	- [3. Génération de l'archive de déploiement](#3-génération-de-larchive-de-déploiement)

## TL;DR
1. Fork + clone du repo
2. Dans un terminal :
	```bash
	cd server
	mvn compile exec:java
	```
3. ouvrir dans le navigateur http://localhost:8080/api/v1/myresource

## Setup du projet
### 1. Installation
Faites un fork de ce repo et clonez dans le dossier de votre choix.

### 2. Lancement du serveur pour les tests
Le serveur se lance avec la commande `mvn exec:java`. La compilation
n'est pas automatique pour cette tâche donc vous devriez plutôt
utiliser : `mvn compile exec:java`.

<img alt="" width="480" src="https://gitlab.com/univlille/defi-agile-iut/skeleton/server/uploads/35bec6ee34eacb5fde539f7a06b26d8e/mvn-compile-exec-java.gif" >

La ressource exemple fournie est accessible à l'URL
http://localhost:8080/api/v1/myresource

Si tout fonctionne correctement, la  page doit afficher le texte "Got it!".

Pour arrêter le serveur, il faut faire un `CTRL + C`

### 3. Génération de l'archive de déploiement
On peut générer une archive avec l'ensemble du code et des librairies
nécessaires pour un déploiement à l'aide de la commande `mvn package`.

Vous obtiendrez dans le répertoire `target` une archive exécutable
nommée `server-1.0-SNAPSHOT.jar`.

Cette archive peut être exécutée au moyen de la commande `java -jar
target/server-1.0-SNAPSHOT.jar`.
