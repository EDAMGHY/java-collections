package ex2;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, Double> qde = new HashMap<String, Double>();

        // Add students notes
        qde.put("Student 1", 12.00);
        qde.put("Student 2", 15.5);
        qde.put("Student 3", 18.75);
        qde.put("Student 4", 10.00);
        qde.put("Student 5", 8.75);
        qde.put("Student 6", 16.25);
        qde.put("Student 7", 20.00);

        displayNotes(qde);


        System.out.println("Augmenter la note:");
        String student = "Student 1";
        double nouvelleNote = qde.get(student) + 1.5;
        qde.put(student, nouvelleNote);
        System.out.println("\nNote de " + student + " augmentée de 1.5 points.");

        displayNotes(qde);


        qde.remove(student);
        System.out.println("\nNote de " + student + " supprimée.");


        displayNotes(qde);

        System.out.println("\nTaille du map : " + qde.size());
        displayNotes(qde);

        // Afficher la note moyenne, max et min
        displayAverageMinMax(qde);

        displayNotes(qde);

        // Vérifier s'il y a une note égale à 20
        boolean noteEgale20 = qde.containsValue(20.00);
        if (noteEgale20) {
            System.out.println("\nIl y a une note égale à 20.");
        } else {
            System.out.println("\nAucune note égale à 20.");
        }
        displayNotes(qde);


    }

    private static void displayNotes(HashMap<String, Double> list) {
        System.out.println("----------------------------");
        System.out.println("Liste des notes :");
        list.forEach((etudiant, note) -> System.out.println(etudiant + " : " + note));
        System.out.println("----------------------------");

    }

    // Méthode pour afficher la note moyenne, max et min
    private static void displayAverageMinMax(HashMap<String, Double> notes) {
        double somme = 0;
        double noteMin = Double.MAX_VALUE;
        double noteMax = Double.MIN_VALUE;

        for (double note : notes.values()) {
            somme += note;
            if (note < noteMin) {
                noteMin = note;
            }
            if (note > noteMax) {
                noteMax = note;
            }
        }

        double moyenne = somme / notes.size();

        System.out.println("\nNote moyenne : " + moyenne);
        System.out.println("Note minimale : " + noteMin);
        System.out.println("Note maximale : " + noteMax);
    }
}
