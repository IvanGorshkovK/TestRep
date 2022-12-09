package Algorithyms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++)
            if(array[i]==key)
                return i;
            else
                return -1;
            return 0;
}

    public static void main(String[] args) {
        ArrayElements arrayElements= new ArrayElements(10);
        arrayElements.insert(10);
        arrayElements.insert(4);
        arrayElements.insert(54);
        arrayElements.insert(21);
        arrayElements.insert(55);
        arrayElements.insert(91);
        arrayElements.insert(65);
        arrayElements.insert(2);
        arrayElements.insert(13);
        arrayElements.insert(89);

        arrayElements.display();

        }
    }



class ArrayElements{

    private int nElems;
    private int[] array;



    public ArrayElements(int max) {
        array= new int[max];
        nElems=0;
    }

    public int getnElems() {
        return nElems;
    }

    public int[] getArray() {
        return array;
    }

    public void insert(int value){
        array[nElems]=value;
        nElems++;
    }

    public void display(){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println("");
    }

}