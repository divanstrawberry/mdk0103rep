package lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class bday {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++){
            System.out.println("введи циферку от 1 до 100");
            int userNumber = sc.nextInt();
            if (userNumber==0) {
                System.out.println("пока");
                break;
            }
        }
    }
}