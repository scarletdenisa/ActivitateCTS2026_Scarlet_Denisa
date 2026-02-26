package seminar01.main;

import seminar01.animal.Lion;
import seminar01.animal.Tigru;
import seminar01.animal.Zebra;
import seminar01.zoo.Zookeeper;
import seminar01.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zookeeper zookeeper=new Zookeeper("Ion");
        Lion lion=new Lion("Simba",22,35);
        Zebra zebra=new Zebra("Amalia",11,88);
        Zoo zoo=new Zoo("Gradina zoo",zookeeper);

        zoo.adaugaAnimal(lion);
        zoo.adaugaAnimal(zebra);
        zoo.adaugaAnimal(new Tigru("Tigru",19,"siberian"));
        zoo.feedAllAnimals();
    }
}