package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    private int nbrLegs;

    public Terrestrial() {
        System.out.println("Terrestrial created");
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs){
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public String toString(){
        return "family=" + family + ", name=" + name + ", age=" + age + ", nbrLegs=" + nbrLegs +"]";
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

}
