package com.belkaCoder.noteDream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Class start app!
 *
 */
public class App 
{
    public static void main(String[] args) throws IOException {
        NoteMap note = new NoteMap();
        var list = note.createList();
        int date = 0;
        System.out.print("Добавить заметку на: " + '\n' + "1. Сегодня" + '\n' + "2. Завтра" + '\n' + "3. Послезавтра" + '\n' + "Введите ваш ответ... " );
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateTask = reader.readLine();
        if (dateTask.equals("2") | dateTask.equals("Завтра") | dateTask.equals("завтра")){
            date = 1;
        }
        else if (dateTask.equals("3") | dateTask.equals("Послезавтра") | dateTask.equals("послезавтра")){
            date = 2;
        }
        System.out.println("Введите ваши заметки ");
        var read = new Scanner(System.in);
        int i = 1;
        while (!(read.hasNextInt())) {
            String task = read.nextLine();
            note.addList(i, task);
            i++;
        }

        note.printList(list, date);
    }
}
