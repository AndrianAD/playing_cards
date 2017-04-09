package harp;

import static harp.Tonalinosti.*;
public class Ran {
    public static int z;
    public static void main(String[] args) {
        System.out.println("Введите ключ вашей гармошки:");
        Tonalinosti ton = new Tonalinosti();
        System.out.println("Введите желаемую тональность:");
        z = SelectTon();
        Tonalinosti ton2 = new Tonalinosti(z);
        input_tabs();
        System.out.println();
        System.out.println("1: " + n + "  2: " + z);
        changetabs();


        Dirka dirka = (Dirka) noteList.get(7);
        System.out.println("Тоника 2 позиции: " + dirka.getNote().getName());
        dirka = (Dirka) noteList.get(14);
        System.out.println("Тоника 3 позиции: " + dirka.getNote().getName());
        dirka = (Dirka) noteList.get(9);
        System.out.println("Тоника 4 позиции: " + dirka.getNote().getName());
        getGamma1position();
        getGamma2position();



    }
}
