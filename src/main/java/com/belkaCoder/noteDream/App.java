package com.belkaCoder.noteDream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class start app!
 */
public class App {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static NoteMap note = new NoteMap();

    public static void main(String[] args) throws IOException {

            var list = note.createList();

            System.out.println("1. Посмотреть заметки\n2. Добавить заметки\n3. Удалить заметки");
            String firstCommand = reader.readLine();
            if (firstCommand.equals("1")) {
                note.printList(list);
            } else if (firstCommand.equals("2")) {
                addMainList();
                note.printList(list);
            }
        }

    public static void addMainList() throws IOException {
        System.out.print("Введите дату заметки: ");
        String dateTask = reader.readLine();
        System.out.println("Введите заметки: ");
        var read = new Scanner(System.in);
        ArrayList<String> mass = new ArrayList<>();
        while (!(read.hasNextInt())) {
            String task = read.nextLine();
            mass.add(task);
            note.addList(dateTask, mass);
        }

    }
}
