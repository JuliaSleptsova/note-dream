package com.belkaCoder.noteDream;

import org.apache.commons.lang3.RandomStringUtils;

import org.junit.Test;

import java.io.IOException;

/**
 * Unit test for simple App.
*/
public class AppTest 
{


    @Test
    public void initTest() throws IOException {
        var note = new NoteMap();
        var list = note.createList();
        int date = 0;
        for (int i = 1; i < 21; i++) {
            String generatedString = RandomStringUtils.randomAlphabetic(10);
            note.addList(i,  generatedString);
        }
        note.printList(list, date);
    }


}
