# 💧 SAE-S2.01 — Gestion d'une entreprise de vente d'eau

Ce projet Java modélise le fonctionnement d'une entreprise spécialisée dans la vente d'eau. Il permet de gérer les clients, les commandes, les paiements, les entrepôts et les stocks, tout en intégrant des stratégies de traitement de paiement.

## 🏗️ Architecture du projet

Le cœur du projet repose sur la classe `EntrepriseVenteEau`, qui centralise la gestion des entités suivantes :

- `Client` : gestion des clients
- `Commande` : suivi des commandes
- `Paiement` : traitement et remboursement via des stratégies
- `Entrepot` : stockage physique
- `StockGlobal` : agrégation des stocks
- `Eau` et `StockEau` : gestion des produits

## 📦 Fonctionnalités principales

- Ajouter et rechercher des clients par nom
- Ajouter des entrepôts et gérer les stocks par produit
- Créer et rechercher des commandes
- Traiter et rembourser des paiements via des stratégies (`TraitementPaiement`)
- Affichage global de l’état de l’entreprise

## 🛠️ Technologies utilisées

- Java (JDK 17+ recommandé)
- Eclipse avec plugin EGit
- Git pour le versioning

## 📁 Structure du dépôt

```text
SAE-S2.01/
├── src/
│   └── SAET/
│       ├── EntrepriseVenteEau.java
│       ├── Client.java
│       ├── Commande.java
│       ├── Paiement.java
│       ├── Entrepot.java
│       ├── Eau.java
│       ├── StockEau.java
│       ├── StockGlobal.java
│       └── TraitementPaiement.java
└── README.md
```

## 🚀 Lancer le projet

1. Cloner le dépôt :
   ```bash
   git clone git@github.com:leoyeh62/SAE-S2.01.git
