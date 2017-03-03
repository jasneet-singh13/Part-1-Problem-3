import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

        int n = Integer.parseInt(scanner.next());
        System.out.println(SumOfNumbers(n));
    }

    private static int SumOfNumbers(int number){
        int sum = 0;
        for (int i = 0;i<=number;i++){
            sum = sum + i;
        }
        return sum;
    }
}
