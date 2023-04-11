import java.util.Scanner;

public class numberScanner {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        System.out.println ("Вы ввели число" + number);

        int n = 10;



        sc.close();


    }
}
