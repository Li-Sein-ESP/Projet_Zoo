package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected /*private*/ Animal[] animals;
    protected /*private*/ String name;
    protected /*private*/ String city;
    protected /*private*/  int nbrCages=25;
    protected /*private*/ int nbrAnimal;

    public Zoo ( String name, String city ) {
        if (name != null && !name.isEmpty()){
            this.animals = new Animal[nbrCages];
            this.name = name;
            this.city = city;

        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void Display_Zoo(){
        System.out.println("Name: " + name + " City: " + city + " n° Cages: " + nbrCages + "n° Animals: " + nbrAnimal);
    }


    public Boolean addAnimal (Animal animal){
        if (searchAnimal(animal)!=-1)
            return false;
        if(isZooFull())
            return false;

        for (int i = nbrAnimal; i < nbrCages; i++){
                if (animals[i] == null){
                    animals[i] = animal;
                    nbrAnimal++;
                    return true;
                }
            }

        return false;
    }
    public void DisplayAnimal(){
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i]!=null) {
                System.out.println(animals[i].toString());
            }
        }
    }

    public int searchAnimal(Animal animal){
        if (animal == null || animal.name == null){
            return -1;
        }
        for (int i =0; i<nbrCages; i++){
            if (animals[i]!=null && animals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int Position=searchAnimal(animal);
        if (Position ==-1)
            return false;
        for (int i = Position; i < nbrAnimal; i++)
            animals[i] = animals[i + 1];
        nbrAnimal--;
        return true;
    }

    public boolean isZooFull(){
            return nbrCages == nbrAnimal;
        }


    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimal > z2.nbrAnimal)
            return z1;
        return z2;
    }
    public String toString(){
        return "Name: " + name + " / " + " City: " + city + " / " + " n° Cages: " + nbrCages + " / " + "n° Animals: " + nbrAnimal;
    }
}




