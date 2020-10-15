package com.belkaCoder.noteDream;

import com.belkaCoder.noteDream.NoteMap;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void initTest() throws IOException {
        var note = new NoteMap();
        var list = note.createList();
        LocalDate data = LocalDate.now();
        long count = 0;
        for (int j = 0; j < 10; j++) {
            ArrayList<String> mass = new ArrayList<>();

            for (int i = 0; i < 20; i++) {
                String task = i + ". " + RandomStringUtils.randomAlphabetic(10);
                mass.add(task);
            }
            note.addList(data, mass);
            data = data.plusDays(count);
            count++;


        }
        note.printList(list);
    }


}
