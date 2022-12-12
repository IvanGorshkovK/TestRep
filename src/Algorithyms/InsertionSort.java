package Algorithyms;


import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array={10,26,3,14,28,67,24,13,99,5,41};

        int current;

        for(int i=1;i< array.length;i++){
            current=array[i];
            int j=i;
            while(j>0 && array[j-1]>current){
                array[j]=array[j-1];
                j--;
            }
            array[j]=current;
        }
        System.out.println(Arrays.toString(array));


    }
}
