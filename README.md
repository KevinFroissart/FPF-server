# Prérequis

## Docker Windows 10 pro :
[Docker](https://docs.docker.com/docker-for-windows/install/)

## Docker Windows 10 :
[Docker ToolBox](https://docs.docker.com/toolbox/toolbox_install_windows/)

## Docker Linux :
[Docker](https://docs.docker.com/engine/install/)

# Server

##Lancement du docker
Pour démarer le docker:
Executez Docker Quickstart Terminal, rendez vous à la racine du projet et executez la commande suivante:
```docker-compose up```

##Lancement du serveur
Pour démarer le serveur, executez la commande suivante:
* Windows: ```gradlew.bat bootRun```
* Linux: ```./gradlew bootRun```

##Lancement des tests
Pour démarer les tests, executez la commande suivante:
* Windows: ```gradlew.bat test```
* Linux: ```./gradlew test```

##Compilation
Pour compiler le projet, executez la commande suivante:
* Windows: ```gradlew.bat bootJar```
* Linux: ```./gradlew bootJar```

Le jar compilé va se trouver dans le dossier ```build/libs```