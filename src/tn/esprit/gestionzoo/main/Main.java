package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Animal chat;
        Animal chien;
        Animal rat;
        Animal vache;

        Zoo frigya = new Zoo("esprit","ariana");
        Zoo Belvedere = new Zoo("Belvedere","Tunis");

        chat = new Animal("chat","michou",1,true);
        chien = new Animal("chien","bobby",2,true);
        rat = new Animal("rat","ratatouille",2,true);
        vache = new Animal("Vache","Moujira",4,true);

        frigya.addAnimal(chien);
        frigya.addAnimal(chat);
        frigya.addAnimal(rat);

        Belvedere.addAnimal(vache);

        frigya.showAnimals();
        Belvedere.showAnimals();

        frigya.removeAnimal(rat);
        frigya.showAnimals();

        System.out.println(frigya.isZooFull());

        System.out.println(Zoo.comparerZoo(frigya,Belvedere));

        Terrestrial animal1 = new Terrestrial();
        //Aquatic animal2 = new Aquatic();
        Dolphin animal3 = new Dolphin();
        Penguin animal4 = new Penguin();

        Terrestrial animal5 = new Terrestrial("lions", "simba" , 3 , true ,4);
        System.out.println(animal5);

        Dolphin animal6 = new Dolphin("dolfin", "sebastian" , 10, false , "Ocean" ,23.3f);
        System.out.println(animal6);

        Penguin animal7 = new Penguin("White pengu", "mohsen", 5, false, " Antaractica", 15);
        System.out.println(animal7);

        //animal2.swim();
        animal3.swim();
        animal4.swim();

        Aquatic animal8 = new Dolphin("douflin", "Flipper", 8, true, "Oceanic", 35.5f);
        Aquatic animal9 = new Penguin("al quraydis", "Waddles", 4, false, "Antarctic", 150.0f);
        Aquatic animal10 = new Penguin("al quraydis", "Waddles", 4, false, "Antarctic", 85.0f);

        frigya.addAquaticAnimal(animal8);
        frigya.addAquaticAnimal(animal9);
        frigya.addAquaticAnimal(animal10);

        System.out.println(frigya.maxPenguinSwimmingDepth());

        frigya.displayNumberOfAquaticsByType();

        System.out.println(animal9.equals(animal10));
    }
}