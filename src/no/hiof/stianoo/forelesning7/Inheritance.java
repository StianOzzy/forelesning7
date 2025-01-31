package no.hiof.stianoo.forelesning7;

import no.hiof.stianoo.forelesning7.model.BusDriver;
import no.hiof.stianoo.forelesning7.model.Carpenter;
import no.hiof.stianoo.forelesning7.model.CarpenterApprentice;
import no.hiof.stianoo.forelesning7.model.Person;

import java.time.LocalDate;
import java.util.jar.JarOutputStream;

public class Inheritance {
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

        // Carpenter Apprentice sin start og sluttdato
        LocalDate startDate1 = LocalDate.now();
        LocalDate endDate1 = LocalDate.of(2026,6,15);

        CarpenterApprentice apprentice1 = new CarpenterApprentice("Jo", "Då",
                21, 0, startDate1, endDate1);

        System.out.println("Carpenter Apprentice: " + apprentice1.getFirstName() + " " + apprentice1.getLastName());
        System.out.println("Trainee period: " + apprentice1.getTrainingStartDate() + " - " + apprentice1.getTrainingEndDate());



        System.out.println("\n---toString()---");

        System.out.println("\n-Person1 object-");
        System.out.println(person1);

        System.out.println("\n-Carpenter1 object-");
        System.out.println(carpenter1);

        System.out.println("\n-BusDriver1 object-");
        System.out.println(busDriver1);

        System.out.println("\n-Apprentice1 object-");
        System.out.println(apprentice1);


    }
}
