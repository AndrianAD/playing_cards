package harp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static harp.Ran.z;

public class Tonalinosti {
    public static ArrayList noteList = new ArrayList();
    public static ArrayList noteList2 = new ArrayList();
    public static ArrayList gamma = new ArrayList();
    public static List<String> list = new ArrayList<String>();
    public static List<String> list2 = new ArrayList<String>();
    Tabs[] tabs = Tabs.values;
    Note[] note = Note.values;
    static String rezult=" ";
    public static int n = SelectTon();// номер первой тольности

// конструктор первой тональности
    public Tonalinosti() {
        for (int i = n; i < tabs.length + n; i++) {
            Dirka dirka = new Dirka(tabs[i - n], note[i]);
            noteList.add(dirka);
            System.out.println(dirka.getNote().getName() + ":   " + dirka.getTabs().getName());
        }
    }
// // конструктор второй тональности
    public Tonalinosti(int z) {
        for (int i = z; i < tabs.length + z; i++) {
            Dirka dirka = new Dirka(tabs[i - z], note[i]);
            noteList2.add(dirka);
            System.out.println(dirka.getNote().getName() + ":   " + dirka.getTabs().getName());
        }

    }

// Ввод исходных табов от пользователя
    public static void input_tabs() {
        System.out.println("Введите ваши табы:");
        Scanner scanner = new Scanner(System.in);
        String inputtabs = scanner.nextLine();
        String str[] = inputtabs.split(" ");
        list = Arrays.asList(str);
//        for (String s : list) {
//            System.out.print(" " + s);
//        }
    }

    public static void changetabs() {
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            k=0;
            for (int j = 0; j < noteList.size(); j++) {
                Dirka dirka = (Dirka) noteList.get(j);
                k++;
                String list_i = list.get(i);
                String list_J = dirka.getTabs().getName();
                if (list_J.equals(list_i)) {
//                    list2.add(0, String.valueOf(k));
//                    for (String s : list2) {
//                        System.out.println(" лист 2 индексы " + s);
                    int peremennaia=k+z-n-1;
                    if(peremennaia<0){

                    }
                    Dirka temp= (Dirka) noteList2.get(peremennaia);
                    rezult += temp.getTabs().getName();

                    break;

                    }

                }
            }
        System.out.println("Результат" +rezult);
        }



    public static ArrayList getGamma1position() {
        gamma.clear();
        gamma.add(noteList.get(0));
        gamma.add(noteList.get(2));
        gamma.add(noteList.get(4));
        gamma.add(noteList.get(5));
        gamma.add(noteList.get(7));
        gamma.add(noteList.get(9));
        gamma.add(noteList.get(11));
        gamma.add(noteList.get(12));
        System.out.println("Гамма первой позиции: ");
        for (int i = 0; i < 8; i++) {
            Dirka dirka = (Dirka) gamma.get(i);
            System.out.print(" " + dirka.getNote().getName());
            System.out.println(" " + ": " + dirka.getTabs().getName());
        }
        return gamma;
    }

    public static ArrayList getGamma2position() {
        gamma.clear();
        gamma.add(noteList.get(7));
        gamma.add(noteList.get(9));
        gamma.add(noteList.get(11));
        gamma.add(noteList.get(12));
        gamma.add(noteList.get(14));
        gamma.add(noteList.get(16));
        gamma.add(noteList.get(18));
        gamma.add(noteList.get(19));
        System.out.println();
        System.out.println("Гамма второй позиции: ");
        for (int i = 0; i < 8; i++) {
            Dirka dirka = (Dirka) gamma.get(i);
            System.out.print(" " + dirka.getNote().getName());
            System.out.println(" " + ": " + dirka.getTabs().getName());
        }
        return gamma;
    }


    public static int SelectTon() {
        Scanner scanner = new Scanner(System.in);
        String ton = scanner.nextLine();
        switch (ton.toUpperCase()) {
            case "G":
                return 0;
            case "AB":
                return 1;
            case "A":
                return 2;
            case "BB":
                return 3;
            case "B":
                return 4;
            case "C":
                return 5;
            case "C#":
                return 6;
            case "D":
                return 7;
            case "EB":
                return 8;
            case "E":
                return 9;
            case "F":
                return 10;
            case "F#":
                return 11;
        }
        return 5;
    }

}


