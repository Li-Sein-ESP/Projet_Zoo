package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin() {}
    public Dolphin(String family ,int age , boolean isMammal, String name,String habitat,float swimmingSpeed) {
        super(habitat,family,age,isMammal,name);
        this.swimmingSpeed = swimmingSpeed;

    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    public String toString() {
        return super.toString()+"SwimmingSpeed: "+swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimingSpeed) {
        this.swimmingSpeed = swimingSpeed;
    }
}
