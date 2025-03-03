package tn.esprit.gestionzoo.entities;

public class Animal {
    protected /*private*/ String family;
    protected /*private*/ String name;
    protected /*private*/ int age;
    protected /*private*/ boolean isMammal;

    public Animal(String family ,int age , boolean isMammal, String name) {
        if(age>=0){
            this.family = family;
            this.name = name;
            this.age = age;
            this.isMammal = isMammal;}
    }

    public Animal() {}

    public int getAge() {
        return age;
    }
/*
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=0)
            this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
*/

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal ;
    }
}
