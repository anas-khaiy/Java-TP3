#!/bin/bash

# Script de test pour tous les exercices Java
# Usage: ./test_all.sh

echo "========================================="
echo "   TESTS DES EXERCICES JAVA"
echo "========================================="
echo ""

# Test Exercice 1
echo "--- Exercice 1: Série Harmonique ---"
echo "Test avec n=5:"
echo "5" | java Exercice1
echo ""

echo "Test avec n=10:"
echo "10" | java Exercice1
echo ""

# Test Exercice 2
echo "--- Exercice 2: Triangle Isocèle ---"
echo "Test avec hauteur=4:"
echo "4" | java Exercice2
echo ""

echo "Test avec hauteur=6:"
echo "6" | java Exercice2
echo ""

# Test Exercice 3
echo "--- Exercice 3: Carrés des Impairs ---"
echo "Test avec n=5:"
echo "5" | java Exercice3
echo ""

echo "Test avec n=7:"
echo "7" | java Exercice3
echo ""

# Test Exercice 4
echo "--- Exercice 4: Tableaux 2D ---"
java Exercice4
echo ""

# Test Exercice 5
echo "--- Exercice 5: Rotation Matrice ---"
echo "Test avec matrice 4x4 (exemple du sujet):"
echo "4 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16" | java Exercice5
echo ""

echo "Test avec matrice 3x3:"
echo "3 1 2 3 4 5 6 7 8 9" | java Exercice5
echo ""

echo "Test avec matrice 2x2 (cas minimal):"
echo "2 1 2 3 4" | java Exercice5
echo ""

# Test Exercice 6
echo "--- Exercice 6: Fenêtre Glissante ---"
echo "Test avec n=8, k=4 (exemple du sujet):"
echo "8 4 1 2 2 3 2 1 4 2" | java Exercice6
echo ""

echo "Test avec n=10, k=3:"
echo "10 3 1 1 1 2 2 2 3 3 3 4" | java Exercice6
echo ""

echo "Test avec tous éléments distincts (n=6, k=3):"
echo "6 3 1 2 3 4 5 6" | java Exercice6
echo ""

echo "========================================="
echo "   TOUS LES TESTS TERMINÉS"
echo "========================================="
