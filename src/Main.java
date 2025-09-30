import java.util.Scanner;

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
        //frigya.addAnimal(rat);

        System.out.println(frigya.addAnimal1(rat));
        frigya.displayZoo();

        System.out.println(frigya.removeAnimal2(chien));

        frigya.displayZoo();
        System.out.println(frigya.isZooFull1());

        System.out.println(Zoo.comparerZoo(frigya,Belvedere));


        /*Belvedere.addAnimal(vache);

        frigya.showAnimals();
        Belvedere.showAnimals();

        frigya.removeAnimal(rat);
        frigya.showAnimals();

        System.out.println(frigya.isZooFull());

        System.out.println(Zoo.comparerZoo(frigya,Belvedere));*/

    }
}