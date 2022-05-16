import java.util.Scanner;

class Main {
    static void cutPizza(int n) {
        // for case no 1
        System.out.print((360 % n == 0) ? "1 " : "0 ");
        // for case no 2
        System.out.print((n <= 360) ? "1 " : "0 ");
        // for case no 3
        System.out.print((((n * (n + 1)) / 2) <= 360) ? "1 " : "0 ");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of slices to be made: ");//comment here
        int n = scanner.nextInt(); // user input the number of slices to be made
        cutPizza(n);
    }
}