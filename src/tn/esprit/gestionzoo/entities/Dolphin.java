package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin (){
        //calling the Aquatic constructor by default
        System.out.println("Dolphin created");
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed){
        super(family, name, age, isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public String toString(){
        return "family=" + family + ", name=" + name + ", age=" + age + ", habitat=" + habitat +  ", swimmingSpeed=" + swimmingSpeed + "]";
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim(){
        System.out.println("this dolphin is swimming");
    }
}

