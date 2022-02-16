package biasaNo1until3;

import java.util.*;

public class sort {
    public static void main(String[] args) {
        //Deklarasi arraylist angka
        ArrayList<Integer> angka = new ArrayList<Integer>();
        angka.add(1);
        angka.add(12);
        angka.add(7);
        angka.add(4);

        //Sorting tanpa menggunakan method stream
        Collections.sort(angka);

        System.out.println(angka);

    }
}
