package com.belkaCoder.noteDream;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class NoteMap {
    private Map<Integer, String> list;


    public void addList(int i, String task) throws IOException {
        list.put(i, task);
    }

    public void printList(Map<Integer, String> list, int date) {
        System.out.println(createDate(date));
        for (Map.Entry<Integer, String> pair : list.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ". " + value);
        }
    }

    public Map<Integer, String> createList() {
        this.list = new HashMap<Integer, String>();
        return list;
    }
    public LocalDate createDate(long dateTask){
        LocalDate date = LocalDate.now();
        return date.plusDays(dateTask);

    }
}

