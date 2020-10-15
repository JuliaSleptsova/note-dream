package com.belkaCoder.noteDream;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;


public class NoteMap {
    private Map<String, ArrayList<String>> list;


    public void addList(String i, ArrayList<String> mass) {
        list.put(i, mass);
    }

    public void printList(Map<String, ArrayList<String>> list) {
        //System.out.println(createDate(date));
        for (Map.Entry<String, ArrayList<String>> pair : list.entrySet()) {
            String key = pair.getKey();
            ArrayList<String> value = pair.getValue();
            System.out.println(key + '\n');
            for (String task : value) {
                System.out.println(task);
            }

        }
    }

    public Map<String, ArrayList<String>> createList() {

        this.list = new HashMap<String, ArrayList<String>>();
        return list;
    }
   /* public LocalDate createDate(long dateTask){
        LocalDate date = LocalDate.now();
        return date.plusDays(dateTask);

    }*/
}

