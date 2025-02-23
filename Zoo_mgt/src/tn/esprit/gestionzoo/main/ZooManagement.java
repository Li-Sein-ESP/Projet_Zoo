package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {


        Dolphin dolphin = new Dolphin("Shark", 11 , true , "Dauohi" , "northpole" , 22.2F);
        Animal Crocodile= new Animal("Chicken",22,true,"Parasite");
        Animal Eaqle= new Animal("Bird",2,true,"Hunter");
        Animal Anaconda= new Animal("Snake",8,true,"Venomous");
        Animal Cheetah= new Animal("Tiger",3,true,"Runner");
        Animal Wolf= new Animal("Dog",11,true,"Red Wolf");
        Animal Giraffe= new Animal("Giraffe",4,true,"Longy");

        Zoo Kassab=new Zoo("Kassab","Manouba"/*,4*/);
        System.out.println(Kassab);
        System.out.println(Crocodile);
        System.out.println(dolphin);
        Kassab.addAnimal(Crocodile);
        Kassab.addAnimal(dolphin);
        Kassab.addAnimal(Anaconda);
        Kassab.addAnimal(Cheetah);
        System.out.println(Kassab.addAnimal(Eaqle));
        System.out.println(Kassab.addAnimal(Wolf));
        System.out.println(Kassab.addAnimal(Giraffe));
        Kassab.Display_Zoo();
        System.out.println(Kassab.searchAnimal(Eaqle));
        Kassab.DisplayAnimal();
        System.out.println(Kassab.removeAnimal(Crocodile));
        Kassab.DisplayAnimal();
        System.out.println(Kassab.isZooFull());


        Zoo Razi=new Zoo("Razi","Manouba"/*,4*/);
        Razi.addAnimal(Crocodile);
        Razi.addAnimal(Anaconda);
        Razi.addAnimal(Cheetah);

        System.out.println(Zoo.compareZoo(Razi,Kassab));
        /*Aquatic aquatic1=new Aquatic();
        aquatic1.sethabitat("Manouba");
        Dolphin dolphin1=new Dolphin();
        dolphin1.setSwimingSpeed(2555.2F);
        Penguin penguin1=new Penguin();
        penguin1.setSwimingDepth(266.2F);
        Terrestrial terrestrial1=new Terrestrial();
        terrestrial1.setNbrLegs(4);*/


    }
}