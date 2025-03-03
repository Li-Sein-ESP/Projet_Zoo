package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected /*private*/ Animal[] animals;
    protected /*private*/ String name;
    protected /*private*/ String city;
    protected /*private*/ final int nbrCages=25;
    protected /*private*/ int nbrAnimal;
    protected Aquatic[] aquaticAnimals ;
    protected int numAquatics=0;


    public Zoo ( String name, String city ) {
        if (name != null && !name.isEmpty()){
            this.animals = new Animal[nbrCages];
            this.aquaticAnimals = new Aquatic[10];
            this.name = name;
            this.city = city;

        }
    }

    public int getNbrAnimal() {
        return nbrAnimal;
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


    public void addAnimal (Animal animal)throws ZooFullException,InvalidAgeException{
        if (isZooFull()){
            throw new ZooFullException("Zoo Full");
        }
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif ");
        }
        if (searchAnimal(animal)!=-1)
            System.out.println("Erreur ajout ");
            animals[nbrAnimal] = animal;
            nbrAnimal++;
            System.out.println("ajout avec succes");

    }



    public void addAquaticAnimal (Aquatic animal){

        if (searchAquatic(animal)!=-1)
            System.out.println("Aquatic animal already exist");

        else if(isZooFull())
        { System.out.println("Zoo Full");}

        else
        {
                aquaticAnimals[numAquatics] = animal;
                numAquatics++;
                System.out.println("Aquatic animal added");

        }}


    public void DisplayAnimal(){
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i]!=null) {
                System.out.println(animals[i].toString());
            }
        }
    }
    public void DisplayAquatic(){
        for (int i = 0; i < 10; i++) {
            if (aquaticAnimals[i]!=null) {
                System.out.println(aquaticAnimals[i].toString());
            }
        }
    }
    public int searchAquatic(Aquatic animal){
        if (animal == null || animal.name == null){
            return -1;
        }
        for (int i =0; i<10; i++){
            if (aquaticAnimals[i]!=null && aquaticAnimals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
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



public void aquaticSwim (){

 for(int i=0; i<numAquatics; i++){
        aquaticAnimals[i].swim();
        }}

    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1;
        boolean foundPenguin = false;

        for (int i = 0; i < numAquatics; i++) {
            if (aquaticAnimals[i].getClass() == Penguin.class) {
                if (!foundPenguin || aquaticAnimals[i].getSwimmingDepth() > maxDepth) {
                    maxDepth = aquaticAnimals[i].getSwimmingDepth();
                    foundPenguin = true;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType(){
        int numADol = 0;
        int numPeng = 0;
        for (int i = 0; i < numAquatics; i++) {
            if (aquaticAnimals[i].getClass() == Penguin.class) {
                numPeng++;
            }
            if (aquaticAnimals[i].getClass() == Dolphin.class) {
                numADol++;
            }
        }
        System.out.println("Aquatic animals de type dolphin: " + numADol );
        System.out.println("Aquatic animals de type Penguin: " + numPeng);;

    }




}