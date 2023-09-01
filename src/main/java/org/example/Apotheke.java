package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Apotheke
{
    private Map<String, Medicine> inventory = new HashMap<>();

    public void addMedicine(Medicine med)
    {
        inventory.put(med.getName(), med);
    }

    public void save(Medicine med)
    {
        addMedicine(med);
    }

    public Medicine getMedicineInfo(String medName)
    {
        Medicine result = inventory.get(medName);
        return result;
    }

    public Medicine find(String medName)
    {
        Medicine result = inventory.get(medName);
        return result;
    }

    public void delete(String name)
    {
        inventory.remove(name);
    }
    
    public List<Medicine> getAvailableMedicine() {
        // inventory : give me all meds with available true
        List<Medicine> meds = new ArrayList<>();

        for(Medicine item : inventory.values())
        {
           if(item.getAvailability())
           {
               meds.add(item);
           }
        }
        return meds;
    }

    public void printAllMedsByName()
    {
        // inventory : give me all meds with available true
        List<Medicine> meds = new ArrayList<>();

        for(String key : inventory.keySet())
        {
           System.out.println(key);
        }
    }

    public void changeAvailablilty(String name)
    {
        boolean orinal = inventory.get(name).getAvailability();
        inventory.get(name).setAvailability(!orinal);
    }

    public int getCount() {
        return  inventory.keySet().size();
    }

/*  public List<Med> getAvailableMeds_02()
    {
        List<Med> meds = new ArrayList<>();
        for (Map.Entry<String, Med>  pair : medMap.entrySet())
        {
            String key = pair.getKey();
            Med value = pair.getValue();
            if(value.isAvailable)  meds.add(value);
        }
        return  meds;
    }
    */

    public Map<String, Medicine> getInventory() {
        return inventory;
    }

    public void setInventory(Map<String, Medicine> inventory) {
        this.inventory = inventory;
    }

    public void printMedikamente(){
        for(Medicine item : inventory.values()){
            System.out.println(item);
        }
    }
}

