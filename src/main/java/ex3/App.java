package ex3;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        // Création des Sets pour les groupes A et B
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        groupeA.add("Student 1");
        groupeA.add("Student 5");
        groupeA.add("Student 3");

        groupeB.add("Student 2");
        groupeB.add("Student 3");
        groupeB.add("Student 6");

        // Afficher l'intersection des deux HashSets
        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection des groupes A et B : " + intersection);

        // Afficher l'union des deux HashSets
        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union des groupes A et B : " + union);
    }
}
