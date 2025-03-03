package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;

    public Penguin() {}
    public Penguin(String family ,int age , boolean isMammal, String name,String habitat,float swimmingDepth) {
        super(habitat,family,age,isMammal,name);
        this.swimmingDepth = swimmingDepth;

    }

    @Override
    public void swim() {
        System.out.println("This penguin " +name+" is swimming.");
    }

    @Override
    public String toString() {
        return super.toString()+"SwimmingDepth: " + swimmingDepth ;
    }

    public float getSwimmingDepth()
    {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
}
