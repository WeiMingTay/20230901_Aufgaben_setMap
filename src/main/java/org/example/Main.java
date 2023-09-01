package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    }
}