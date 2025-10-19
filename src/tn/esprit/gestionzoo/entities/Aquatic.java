package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(){
        System.out.println("Aquatic created");
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat){
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void swim(){
        System.out.println("this aquatic animal is swimming");
    }
}