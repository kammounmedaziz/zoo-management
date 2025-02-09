import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        // Étape 1 : Création des objets
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Zoo myZoo = new Zoo("Safari Zoo", "Tunis", 20);

        // Étape 2 : Ajout d'animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(new Animal("Reptile", "Crocodile", 12, false));
        myZoo.addAnimal(new Animal("Bird", "Parrot", 3, false));

        // Étape 3 : Affichage des informations du zoo
        myZoo.displayZoo();

        // Étape 4 : Utilisation de Scanner pour modifier les informations du zoo
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nouveau nom pour le zoo : ");
        String newName = scanner.nextLine();

        System.out.print("Entrez une nouvelle ville pour le zoo : ");
        String newCity = scanner.nextLine();

        System.out.print("Entrez un nouveau nombre de cages : ");
        int newNbrCages;
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide !");
            scanner.next();
        }
        newNbrCages = scanner.nextInt();

        // Création d'un nouveau zoo avec les informations modifiées
        Zoo updatedZoo = new Zoo(newName, newCity, newNbrCages);

        // Affichage du nouveau zoo
        updatedZoo.displayZoo();
        scanner.close();
    }
}
