package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected/*private*/ String habitat;

    public Aquatic() {}
    public Aquatic(String habitat ,String family,int age , boolean isMammal, String name) {
        super(family, age, isMammal, name);
        this.habitat = habitat;
    }

    public String toString() {
        return super.toString()+", habitat: " + habitat;
    }
    /*public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }*/
    public abstract void swim();
    /*public String gethabitat() {
        return habitat;
    }
    public void sethabitat(String habitat) {
        this.habitat = habitat;
    }*/

    public float getSwimmingDepth()
    {
        return 1;
    }

    public boolean equals(Aquatic aquatic) {
        return this.name.equals(aquatic.name)&&this.habitat.equals(aquatic.habitat);
    }

}
