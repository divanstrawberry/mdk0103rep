package lesson2;

public class lesson2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9) {
            System.out.println("этаж,"+i);
            i++;
        }


        for (int t = 1; t <= 9; t++) {
            System.out.println("этаж " + t);
        }

                for (int k = 1; k <= 100; k++) {
                    if (k % 2 == 0) {
                        continue;
                    }
                    if (k == 25) {
                        break;
                    }
                    System.out.println(k);
                }



}
}

