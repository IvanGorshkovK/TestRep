package Algorithyms;

public class BinarySearch {

    public static int binarySearch(int []array, int elementToFind){
        int middleElement;
        int startElement=0;
        int endElement=array.length-1;
        while(startElement<=endElement){
            middleElement=startElement+ (endElement-startElement)/2;
            if(array[middleElement]==elementToFind)
                System.out.println("Элемент находится под индексом "+middleElement);
            if(array[middleElement]>elementToFind)
                endElement=middleElement-1;
            else
                startElement=middleElement+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={8,17,35,49,65,69,73,89,92,95,99};

        binarySearch(arr,89);
        System.out.println(binarySearch(arr,20));

    }
}
