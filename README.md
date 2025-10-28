# 🎯 Jeu du Chiffre Mystère

##  📝 Description

Ce projet est un jeu interactif en Java où le joueur doit deviner un **chiffre mystère** compris entre 1 et 100.  
Le programme indique si le chiffre entré est **plus grand** ou **plus petit** que le nombre à deviner.  
Le jeu continue jusqu’à ce que le joueur trouve le bon nombre, et le joueur peut choisir de rejouer ou de quitter.

---

## ✨ Fonctionnalités

- Génération aléatoire d’un chiffre entre 1 et 100.
- Vérification des entrées utilisateur pour s’assurer que ce sont des entiers valides.
- Indication pour guider le joueur (plus grand ou plus petit).
- Comptage du nombre de tentatives pour trouver le chiffre.
- Option de rejouer ou de quitter le jeu.
- Gestion robuste des entrées utilisateur pour éviter les erreurs.

---

##  📂 Fichiers

- `Game.java` : fichier principal contenant tout le code du jeu.

---

##  💻 Exécution
 
**Compiler le code** avec Java :

```bash
javac Game.java
```

**Exécuter le jeu :** 

```bash
java Game
```

**Suivez les instructions à l'écran pour jouer 🎮**

---

## 🕹️ Utilisation 

- Le jeu commence par demander si vous souhaitez jouer.

- Si vous répondez oui, le jeu génère un chiffre mystère.

- Entrez vos suppositions. Le jeu vous indiquera si votre chiffre est trop grand ou trop petit.

- Continuez à deviner jusqu’à trouver le chiffre.

- Une fois trouvé, le jeu affiche le nombre de tentatives. 🏆

- Vous pouvez choisir de rejouer ou de quitter.

---

## 📖 Exemple : 

```bash
Bonjour, le but du jeu est simple, vous devez retrouver le chiffre mystère !!
Souhaitez-vous jouer à mon jeu ? oui/non
oui
Choisissez un chiffre entre 1 et 100
50
Saisissez une valeur plus grande
75
Saisissez une valeur plus petite
60
Saisissez une valeur plus grande
65
Bravo vous avez trouvé le chiffre mystère 65 -> en 4 coups.
Voulez-vous rejouer ? 
non
Le jeu est terminé !!

```