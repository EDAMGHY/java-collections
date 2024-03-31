package ex1;

import java.util.ArrayList;

public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> products = new ArrayList<Produit>();

        // Ajout produits
        products.add(new Produit(1, "Produit 1", 10.99));
        products.add(new Produit(2, "Produit 2", 20.99));
        products.add(new Produit(3, "Produit 3", 30.99));

        // Supprimer un produit par indice
        int indiceASupprimer = 1;
        if (indiceASupprimer >= 0 && indiceASupprimer < products.size()) {
            Produit produitSupprime = products.remove(indiceASupprimer);
            System.out.println("Produit supprimé avec succès : " + produitSupprime);
        } else {
            System.out.println("Indice invalide.");
        }

        // Afficher la liste des produits
        System.out.println("\nListe des produits après suppression :");
        for (Produit produit : products) {
            System.out.println(produit);
        }

        // Modifier un produit par indice
        int indiceAModifier = 0;
        if (indiceAModifier >= 0 && indiceAModifier < products.size()) {
            Produit produitAModifier = products.get(indiceAModifier);
            produitAModifier.setNom("Nouveau nom");
            produitAModifier.setPrix(99.99);
            System.out.println("\nProduit modifié avec succès : " + produitAModifier);
        } else {
            System.out.println("Indice invalide.");
        }

        // Rechercher un produit par nom
        String nomRecherche = "Produit 3";
        boolean trouve = false;
        for (Produit produit : products) {
            if (produit.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("\nProduit trouvé : " + produit);
                trouve = true;
                break; // Quitter la boucle dès qu'un produit est trouvé
            }
        }
        if (!trouve) {
            System.out.println("Aucun produit trouvé avec ce nom.");
        }
    }
}
