package no.hiof.stianoo.forelesning7;

import no.hiof.stianoo.forelesning7.model.BusDriver;
import no.hiof.stianoo.forelesning7.model.Carpenter;
import no.hiof.stianoo.forelesning7.model.Person;

public class Main {
    public static void main(String[] args) {

    Person person1 = new Person("Ola", "Nordmann",20);

        System.out.println("Person1: " + person1.getFirstName() + " " + person1.getLastName());

        Carpenter carpenter1 = new Carpenter("Rudolf", "Arnesen", 45, 3);

        System.out.println("Carpenter1: " + carpenter1.getFirstName() + " " + carpenter1.getLastName());

        System.out.println("Carpenter 1 has built " + carpenter1.getNumHousesBuilt() + " houses");

        BusDriver busDriver1 = new BusDriver("Henning", "Scharning", 23, "Skogbygda - Fenstad");

        System.out.println("Bus Driver: " + busDriver1.getFirstName() + " " + busDriver1.getLastName());

        System.out.println("Bus driver route: " + busDriver1.getRoute());

        System.out.println("\n---Print Descriptions of different objects");
        person1.printDescription();
        carpenter1.printDescription();
        busDriver1.printDescription();
    }
}
