package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Medicine m1 = new Medicine("Alteroxin", 30, true);
        Medicine m2 = new Medicine("Doxycylin", 15, true);
        Medicine m3 = new Medicine("Ibuprofen", 7, false);

        Apotheke apo = new Apotheke();
        apo.getInventory().put(m1.getName(), m1);
        apo.getInventory().put(m2.getName(), m2);
        apo.getInventory().put(m3.getName(), m3);

        apo.printAllMedsByName();
        apo.changeAvailablilty("Ibuprofen");

        System.out.println(m3.getAvailability());


        System.out.println(apo.find("asd"));
        apo.printMedikamente();

        System.out.println("-----------");



        Set<Integer> dustin = new HashSet<>();
        dustin.add(3);
        dustin.add(11);
        dustin.add(2);

        Set<Integer> ming = new HashSet<>();
        ming.add(2);
        ming.add(5);
        ming.add(9);

        Set<Integer> diana = new HashSet<>();
        diana.add(1);
        diana.add(11);
        diana.add(111);


        System.out.println(dustin);
        dustin.removeAll(diana);

      //  System.out.println(dustin.addAll(ming));

        System.out.println(dustin);
        System.out.println(diana);
        dustin.addAll(ming);
        System.out.println(dustin);

    }
}