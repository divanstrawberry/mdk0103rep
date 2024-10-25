import java.util.Scanner;

public class random {
    public static void main(String[] args){
        int number = (int) (Math.random()*100)+1;
        System.out.println("проверим твои навыки экстрасенса");
        for (int i=1; i<=3; i++){
            Scanner sc=new Scanner(System.in);
            int chislo = sc.nextInt();
            if (chislo > number) {
                System.out.println("поменьше");
            }else if (chislo<number) {
                System.out.println("бери больше");
            }else {
                System.out.println("япии умничка");
                break;
            }
            if (i==3){
                System.out.println("правильным было " + number);
            }
        }
    }
}
