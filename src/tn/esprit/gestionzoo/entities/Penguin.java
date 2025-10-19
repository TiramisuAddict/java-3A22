package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(){
        //calling the Aquatic constructor by default
        System.out.println("Penguin created");
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth){
        super(family, name, age, isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public String toString(){
        return "family=" + family + ", name=" + name + ", age=" + age + ", habitat=" + habitat +  ", swimmingDepth=" + swimmingDepth + "]";
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
}
