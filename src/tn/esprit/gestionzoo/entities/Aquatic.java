package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
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

    abstract void swim();

    @Override
    public boolean equals(Object o) {
        if (o instanceof Aquatic) {
            Aquatic a = (Aquatic) o; // downcast object -> aquatic
            return this.getName().equals(a.getName()) && this.getAge()==a.getAge() && this.getHabitat().equals(a.getHabitat());
        }else {
            return false;
        }
    }
}