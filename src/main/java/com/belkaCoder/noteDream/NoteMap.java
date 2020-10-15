package com.belkaCoder.noteDream;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class NoteMap {
    private Map<LocalDate, ArrayList<String>> list;
    static  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");


    public void addList(LocalDate dataTask, ArrayList<String> mass) {
        if(list.containsKey(dataTask)){
            ArrayList<String> value = list.get(dataTask);
            value.addAll(mass);
            list.put(dataTask, value);
        }
        else {
            list.put(dataTask, mass);
        }
    }

    public void printList(Map<LocalDate, ArrayList<String>> list) {
        for (Map.Entry<LocalDate, ArrayList<String>> pair : list.entrySet()) {
            LocalDate key = pair.getKey();
            ArrayList<String> value = pair.getValue();
            System.out.println(dtf.format(key));
            for (String task : value) {
                System.out.println(task);
            }
        }
    }

    public Map<LocalDate, ArrayList<String>> createList() {
        this.list = new HashMap<LocalDate, ArrayList<String>>();
        return list;
    }
   public LocalDate createDate(String dateTask){
       //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(dateTask, dtf);
    }
    public void deleteList(LocalDate dataTask){
        list.remove(dataTask);

    }
}

