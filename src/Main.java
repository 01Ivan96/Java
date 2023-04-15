import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        // Задача №1
        // /**
        for (int i=1; i<=num; i++) {
            int sum = 0;
            for (int j=1; j<=i; j++) {
                sum += j;
                System.out.printf("%d \t", j);

            }
            System.out.printf("= \t %d", sum);
            System.out.println("");
        }
        // **/

        // Задача №2
        /**
        int fact = 1;
        for (int i=1; i<=num; i++) {
            fact *= i;
            }
        System.out.printf("%d! = %d", num, fact);
         **/


        // Задача №3
        /**
        System.out.print("2 \t");

         for (int i=3; i<=num; i+=2) {
             boolean flag = true;
             for (int j=2; j<=i/2; j++) {
                 if (i%j == 0) {
                     flag = false;
                     break;
                 }
             }
             if (flag) System.out.printf("%d \t", i);
         }
         **/

        // Задача №4
        /**
        System.out.print("Input a number: ");
        int num2 = in.nextInt();
        System.out.print("Input math operation: ");
        String operation = in.nextLine();
        if (operation == "+") {
            float res = num + num2;
            System.out.printf("%d + %d = %f", num, num2, res);
        } else if (operation == "-") {
            float res = num - num2;
            System.out.printf("%d - %d = %f", num, num2, res);
        } else if (operation == "*") {
            float res = num * num2;
            System.out.printf("%d * %d = %f", num, num2, res);
        } else if (operation == "/") {
            float res = num / num2;
            System.out.printf("%d / %d = %f", num, num2, res);
        }
        **/

        in.close();
    }
}