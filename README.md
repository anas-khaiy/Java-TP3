# Exercices Java - Collection Complète

Ce répertoire contient 6 exercices Java couvrant différentes structures de données et algorithmes.

## 📋 Liste des Exercices

### Exercice 1 - Série Harmonique
**Fichier**: `Exercice1.java`

Calcule la somme des n premiers termes de la série harmonique : 1 + 1/2 + 1/3 + ... + 1/n

**Compilation et Exécution**:
```bash
javac Exercice1.java
java Exercice1
```

**Exemple d'utilisation**:
```bash
echo "5" | java Exercice1
# Sortie: La somme des 5 premiers termes de la série harmonique est : 2.283333333333333
```

---

### Exercice 2 - Triangle Isocèle d'Étoiles
**Fichier**: `Exercice2.java`

Affiche un triangle isocèle formé d'étoiles avec une hauteur donnée.

**Compilation et Exécution**:
```bash
javac Exercice2.java
java Exercice2
```

**Exemple d'utilisation**:
```bash
echo "4" | java Exercice2
# Sortie:
#    *
#   ***
#  *****
# *******
```

---

### Exercice 3 - Carrés des Nombres Impairs
**Fichier**: `Exercice3.java`

Crée un tableau contenant les carrés des n premiers nombres impairs et les affiche.

**Compilation et Exécution**:
```bash
javac Exercice3.java
java Exercice3
```

**Exemple d'utilisation**:
```bash
echo "5" | java Exercice3
# Sortie:
# Combien de valeurs : 1 a pour carre 1
# 3 a pour carre 9
# 5 a pour carre 25
# 7 a pour carre 49
# 9 a pour carre 81
```

---

### Exercice 4 - Classe Utilitaire pour Tableaux 2D
**Fichier**: `Exercice4.java`

Classe utilitaire contenant des méthodes statiques pour manipuler des tableaux de tableaux de doubles:
- `affiche(double[][] t)` - Affiche le tableau
- `regulier(double[][] t)` - Vérifie si toutes les lignes ont la même taille
- `sommeLignes(double[][] t)` - Calcule la somme de chaque ligne
- `somme(double[][] t1, double[][] t2)` - Additionne deux tableaux

**Compilation et Exécution**:
```bash
javac Exercice4.java
java Exercice4  # Exécute les tests intégrés
```

---

### Exercice 5 - Rotation de Matrice 90° en Place
**Fichier**: `Exercice5.java`

Fait pivoter une matrice carrée N×N de 90° dans le sens horaire, sans utiliser de tableau auxiliaire (complexité mémoire O(1)).

**Algorithme**: Transposition + Renversement de chaque ligne

**Compilation et Exécution**:
```bash
javac Exercice5.java
java Exercice5
```

**Exemple d'utilisation**:
```bash
echo "4 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16" | java Exercice5
# Entrée:
# 1  2  3  4
# 5  6  7  8
# 9  10 11 12
# 13 14 15 16
#
# Sortie (90° horaire):
# 13 9  5  1
# 14 10 6  2
# 15 11 7  3
# 16 12 8  4
```

---

### Exercice 6 - Fenêtre Glissante (Valeurs Distinctes)
**Fichier**: `Exercice6.java`

Pour un tableau d'entiers T de taille n et une fenêtre de taille k, calcule le nombre d'éléments distincts dans chaque position de la fenêtre.

**Complexité**: O(n) avec utilisation d'un tableau de fréquences

**Compilation et Exécution**:
```bash
javac Exercice6.java
java Exercice6
```

**Exemple d'utilisation**:
```bash
echo "8 4 1 2 2 3 2 1 4 2" | java Exercice6
# Entrée: n=8, k=4, tableau=[1,2,2,3,2,1,4,2]
# Fenêtres:
# [1,2,2,3] → 3 distincts
# [2,2,3,2] → 2 distincts
# [2,3,2,1] → 3 distincts
# [3,2,1,4] → 4 distincts
# [2,1,4,2] → 3 distincts
#
# Sortie: 3 2 3 4 3
```

---

## 🚀 Compilation Globale

Pour compiler tous les exercices en une seule commande:
```bash
javac *.java
```

## 📝 Notes Techniques

- Tous les programmes utilisent `Scanner` pour la lecture des entrées
- Les programmes sont conçus pour être robustes avec gestion des cas d'erreur
- Exercice 5 et 6 respectent les contraintes de complexité demandées
- Exercice 4 inclut un programme de test intégré

## 📊 Tests Suggérés

### Exercice 1
- n=1 (cas minimal)
- n=10, n=100 (valeurs moyennes)

### Exercice 2
- hauteur=1 (cas minimal)
- hauteur=10 (valeur moyenne)

### Exercice 3
- n=1 (cas minimal)
- n=10 (valeur moyenne)

### Exercice 5
- N=2 (cas minimal)
- N impair (ex: N=5)
- Matrice symétrique
- Valeurs négatives

### Exercice 6
- k=1 (fenêtre minimale)
- k=n (fenêtre maximale)
- Tous éléments identiques
- Tous éléments distincts
- Valeurs aux bornes (0 et 100000)
