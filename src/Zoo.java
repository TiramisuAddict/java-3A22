public class Zoo {
    Animal[] animals;
    String name;
    String city;
    static final int NBR_CAGES = 25;

    public Zoo() {
    }
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[NBR_CAGES];
    }

    /*public void displayZoo(){
        System.out.println("Zoo name: " + name + ", city: " + city + ", nbrCages: " + NBR_CAGES);
    }*/

    @Override
    public String toString() {
        return "Zoo name: " + name + ", city: " + city + ", nbrCages: " + NBR_CAGES;
    }

    boolean addAnimal1(Animal animal){
        if (searchAnimal2(animal) == -1){
            for (int i=0 ; i<NBR_CAGES; i++ ){
                if (animals[i] == null){
                    animals[i] = animal;
                    return true;
                }
            }
        }
        return false;
    }

    void displayZoo(){
        for(Animal anim : animals){
            if (anim == null)
                return;
            System.out.println(anim);
        }
    }

    int searchAnimal2(Animal animal){
        for (int i=0 ; i<NBR_CAGES; i++ ){
            if(animals[i] == null)
                return -1;
            if (animals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal2(Animal animal){
        int indexAnimal = searchAnimal2(animal);
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
    }

    boolean isZooFull1(){
        return animals[NBR_CAGES-1] != null;
    }

    //=======================

    boolean addAnimal(Animal animal){
        if(this.searchAnimal(animal) == -1){
            for (int i =0; i<NBR_CAGES;i++){
                if (animals[i] == null){
                    animals[i] = animal;
                    System.out.println("Animal "+animals[i].name+" added successfully to "+ this.name);
                    return true;
                }
            }
        }else {
            System.out.println("Animal already exists");
        }
        return false;
    }

    void showAnimals(){
        System.out.print(this.name + " = ");
        for (int i=0;i<NBR_CAGES;i++){
            if (animals[i]!=null){
                System.out.print(animals[i].name+" | ");
            }
        }
        System.out.print("\n");
    }

    int searchAnimal(Animal animal){
        for (int i=0;i<NBR_CAGES;i++){
            if (animals[i] != null && animals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal){
        if (this.searchAnimal(animal) != -1){
            for (int i=0;i<NBR_CAGES;i++){
                if (animals[i] == animal){
                    System.out.println("Animal "+ animals[i].name +" removed successfully from "+ this.name);
                    animals[i] = null;
                    return true;
                }
            }
        }else{System.out.println("Animal not found");}
        return false;
    }

    boolean isZooFull(){
        int nbrAnimals = 0;
        for (int i=0;i<NBR_CAGES;i++){
            if (animals[i]!=null){
                nbrAnimals++;
            }
        }
        return nbrAnimals == NBR_CAGES;
    }

    static int nbrAnimaux(Zoo zoo){
        int nbrAnimal = 0;
        for (int i=0;i<NBR_CAGES;i++){
            if (zoo.animals[i]!=null){
                nbrAnimal++;
            }
        }
        return nbrAnimal;
    }
    /*
    static Zoo comparerZoo(Zoo z1, Zoo z2){
        int nbrAnimalsZ1 = 0;
        int nbrAnimalsZ2 = 0;
        for(int i=0;i<NBR_CAGES;i++) if(z1.animals[i] != null) nbrAnimalsZ1++;
        for(int i=0;i<NBR_CAGES;i++) if(z2.animals[i] != null) nbrAnimalsZ2++;
        return (nbrAnimalsZ1 > nbrAnimalsZ2) ? z1 : z2;
    }*/

    static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (nbrAnimaux(z1) > nbrAnimaux(z2) ){
            return z1;
        }else if (nbrAnimaux(z1) == nbrAnimaux(z2)){
            return z2;
        }
        else
            return z2;
    }

}
