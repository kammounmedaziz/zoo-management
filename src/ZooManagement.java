public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "Sasha";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo otherMyZoo = new Zoo("firguia", "bouficha");


        Animal dog = new Animal("Canine", "rex", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a " + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a " + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a " + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
        if (myZoo.isZooFull() !=true){
            System.out.println("voila on a confiermer que la zoo est vide");
        }

//        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());

    }

}