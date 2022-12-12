package Algorithyms;

import java.util.Random;

public class BubleSort {
    public static void main(String[] args) {
        int [] array= new int[10];
        Random random= new Random();
        int tmp=0;
        boolean simple=true;

        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
            System.out.print(array[i]+" ");
        }


        System.out.println();
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
