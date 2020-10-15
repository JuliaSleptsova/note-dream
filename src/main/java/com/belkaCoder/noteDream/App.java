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


    static NoteMap note = new NoteMap();
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        var list = note.createList();
        label:
        while (true) {

            System.out.print("1. Добавить заметки\n2. Показать заметки\n3. Удалить заметки за день\n4. Выйти\nВведите номер нужной команды: ");
            String command = read.nextLine();
            switch (command) {
                case "1":
                    addMainList();
                    break;
                case "2":
                    note.printList(list);
                    break;
                case "3":
                    System.out.print("Введите дату в формате DD.MM.YYYY: ");
                    String dataTask = read.nextLine();
                    note.deleteList(note.createDate(dataTask));
                    break;
                case "4":
                    break label;
            }
        }
        read.close();

    }

    public static void addMainList() throws IOException {
        ArrayList<String> mass = new ArrayList<>();
        System.out.print("Введите дату заметки в формате DD.MM.YYYY: ");
        String dateTask = read.nextLine();
        System.out.println("Введите заметки: ");
        var read = new Scanner(System.in);
        while (!(read.hasNextInt())) {
            String task = read.nextLine();
            mass.add(task);
        }
        note.addList(note.createDate(dateTask), mass);
    }

}
