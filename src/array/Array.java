package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //int[] array1=new int[5];
        //array1[3]=11;
        //System.out.println(Arrays.toString(array1));
        int[] array1=new int[20];
//        array1[0] = (int) (Math.random()*100)+1;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (20 + (Math.random() * 130));
        }

        System.out.println(Arrays.toString(array1));

        int max=0;
        for (int i = 0;i < array1.length;i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println("уффф какое большое " + max);


        // проверка на маленькомсть
        int min=9999;
        for (int i = 0;i < array1.length;i++) {
            if (min > array1[i]) {
                min = array1[i];
            }
        }
        System.out.println("ути микробик " + min);
        //среднее
        int avg=0;
        for (int i = 0;i < array1.length;i++) {
            //avg +=
        }
        System.out.println("среднячок " + avg);







    }
}

