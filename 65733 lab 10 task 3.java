import java.util.Scanner;

class Division {
    private int NuM1;
    private int NuM2;

    public void setNuM1(int num1) {
        NuM1 = num1;
    }

    public void setNuM2(int num2) {
        NuM2 = num2;
    }

    public int getNuM1() {
        return NuM1;
    }

    public int getNuM2() {
        return NuM2;
    }

    public int divide() {
        return NuM1 / NuM2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Division division = new Division();

        int num1 = 10;

        for (int num2 = 9; num2 >= 0; num2--) {
            division.setNuM1(num1);
            division.setNuM2(num2);

            try {
                int result = division.divide();
                System.out.println(num1 + " / " + num2 + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        }

        sc.close();
    }
}
