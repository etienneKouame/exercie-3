import java.util.Scanner ;
import  java.io.File ;


public class WordCounter {
    public static void main(String[] args) throws Exception {
        //  Le chemin vers le fichier texte
        File file = new File("TestExercice3.txt");

        Scanner filescanner = new Scanner(file);  // Ouvre le fichier
        int totalwords = 0;  // Compteur du nombre total de mots

        // Lire le fichier ligne par ligne
        while (filescanner.hasNextLine()) {
            String line = filescanner.nextLine();  // Lire une ligne

            // Sépare la ligne en mots
            String[] words = line.trim().split("\\s+");

            // Ajoute le nombre de mots de la ligne au total
            totalwords += words.length;
        }

        filescanner.close();  // Fermer le fichier

        //  Affiche du total
        System.out.println("Nombre total de mots : " + totalwords);
    }

}
