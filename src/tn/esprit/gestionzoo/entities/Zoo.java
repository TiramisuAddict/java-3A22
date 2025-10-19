package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int NBR_CAGES = 25;

    Aquatic[] aquaticAnimals = new Aquatic[10];

    public Zoo() {}

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[NBR_CAGES];
    }

    @Override
    public String toString() {
        return "Zoo name: " + name + ", city: " + city + ", nbrCages: " + NBR_CAGES;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static int getNbrCages() {
        return NBR_CAGES;
    }

    /* public boolean addAnimal(Animal animal){
        if (searchAnimal2(animal) == -1){
            for (int i=0 ; i<NBR_CAGES; i++ ){
                if (animals[i] == null){
                    animals[i] = animal;
                    return true;
                }
            }
        }
        return false;
    } */

    public boolean addAnimal(Animal animal){
        if(this.searchAnimal(animal) == -1 && !isZooFull()){
            for (int i =0; i<NBR_CAGES;i++){
                if (animals[i] == null){
                    animals[i] = animal;
                    System.out.println("Animal "+animals[i].getName()+" added successfully to "+ this.name);
                    return true;
                }
            }
        }else {
            System.out.println("Animal already exists");
        }
        return false;
    }

    /* public void displayZoo(){
        for(Animal anim : animals){
            if (anim == null)
                return;
            System.out.println(anim);
        }
    } */

    public void showAnimals(){
        System.out.print(this.name + " = ");
        for (int i=0;i<NBR_CAGES;i++){
            if (animals[i]!=null){
                System.out.print(animals[i].getName()+" | ");
            }
        }
        System.out.print("\n");
    }

    /*public int searchAnimal(Animal animal){
        for (int i=0 ; i<NBR_CAGES; i++ ){
            if(animals[i] == null)
                return -1;
            if (animals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
    }*/

    public int searchAnimal(Animal animal){
        for (int i=0;i<NBR_CAGES;i++){
            if (animals[i] != null && animals[i].getName().equals(animal.getName())){
                return i;
            }
        }
        return -1;
    }

    /* public boolean removeAnimal(Animal animal){
        int indexAnimal = searchAnimal(animal);
        int nbrAnim = 0;
        if (indexAnimal == -1)
            return false;
        else {
            for (int i=0 ; i<NBR_CAGES; i++ ){
                if (animals[i] != null){
                    nbrAnim++;
                }
            }

            for (int i = indexAnimal ; i<=nbrAnim; i++){
                    animals[i] = animals[i+1];
            }
            return true;
        }
    } */

    public boolean removeAnimal(Animal animal){
        if (this.searchAnimal(animal) != -1){
            for (int i=0;i<NBR_CAGES;i++){
                if (animals[i] == animal){
                    System.out.println("Animal "+ animals[i].getName() +" removed successfully from "+ this.name);
                    animals[i] = null;
                    return true;
                }
            }
        }else{System.out.println("Animal not found");}
        return false;
    }

    /* public boolean isZooFull(){
        return animals[NBR_CAGES-1] != null;
    }*/

    public boolean isZooFull(){
        int nbrAnimals = 0;
        for (int i=0;i<NBR_CAGES;i++){
            if (animals[i]!=null){
                nbrAnimals++;
            }
        }
        return nbrAnimals == NBR_CAGES;
    }

    public static int nbrAnimaux(Zoo zoo){
        int nbrAnimal = 0;
        for (int i=0;i<NBR_CAGES;i++){
            if (zoo.animals[i]!=null){
                nbrAnimal++;
            }
        }
        return nbrAnimal;
    }

    /* public static Zoo comparerZoo(Zoo z1, Zoo z2){
        int nbrAnimalsZ1 = 0;
        int nbrAnimalsZ2 = 0;
        for(int i=0;i<NBR_CAGES;i++) if(z1.animals[i] != null) nbrAnimalsZ1++;
        for(int i=0;i<NBR_CAGES;i++) if(z2.animals[i] != null) nbrAnimalsZ2++;
        return (nbrAnimalsZ1 > nbrAnimalsZ2) ? z1 : z2;
    } */

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (nbrAnimaux(z1) > nbrAnimaux(z2) ){
            return z1;
        } else if (nbrAnimaux(z1) == nbrAnimaux(z2)){
            return z2;
        } else
            return z2;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        for (int i=0;i<10;i++){
            if (aquaticAnimals[i] == null){
                aquaticAnimals[i] = aquatic;
                System.out.println("auqtic annimal added!");
                 aquaticAnimals[i].swim();
                return;
            }
        }
    }

    public float maxPenguinSwimmingDepth(){
        float maxSwimmingDepth = 0f;
        for (int i=0;i<10;i++){
            if (aquaticAnimals[i]!=null && aquaticAnimals[i].getClass().equals(Penguin.class)){
                Penguin Pengu = (Penguin) aquaticAnimals[i]; // down cast implicit to use getSwimmingDepth
                if (maxSwimmingDepth < Pengu.getSwimmingDepth()){
                    maxSwimmingDepth = Pengu.getSwimmingDepth();
                }
            }
        }
        return maxSwimmingDepth;
    }

    public void displayNumberOfAquaticsByType(){
        int nbrDolphins = 0;
        int nbrPengus = 0;

        for (int i=0;i<10;i++){
            if (aquaticAnimals[i]!=null && aquaticAnimals[i].getClass().equals(Dolphin.class)){
                nbrDolphins++;
            }else if (aquaticAnimals[i]!=null  && aquaticAnimals[i].getClass().equals(Penguin.class)){
                nbrPengus++;
            }
        }

        System.out.println("=====================================");
        System.out.println("We have "+nbrDolphins+" Dolphin(s)");
        System.out.println("We have "+nbrPengus+" Penguins(s)");
        System.out.println("=====================================");
    }
}
