package com.belkaCoder.noteDream;

import com.belkaCoder.noteDream.NoteMap;
import org.apache.commons.lang3.RandomStringUtils;
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
        ArrayList<String> mass = new ArrayList<>();
        String data = "15.10.2020";
        for (int i = 1; i < 21; i++) {
            String task = i + ". " + RandomStringUtils.randomAlphabetic(10);
            mass.add(task);

        }
        note.addList(data, mass);
        note.printList(list);
    }


}
