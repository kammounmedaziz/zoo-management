import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;
    private String name;
    private String city;
    private int nbrCages;

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new ArrayList<>();
    }

    // Méthode pour ajouter un animal au zoo
    public void addAnimal(Animal animal) {
        if (animals.size() < 25) {
            animals.add(animal);
        } else {
            System.out.println("Le zoo ne peut pas contenir plus de 25 animaux !");
        }
    }

    // Méthode displayZoo pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]");
        System.out.println("Animaux dans le zoo :");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    // Méthode toString pour un affichage direct
    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}
