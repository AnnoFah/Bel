import java.util.Scanner;

public class SimpleCalculator {
    // Method untuk penjumlahan
    public static double add(double a, double b) {
        return a + b;
    }

    // Method untuk pengurangan
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method untuk menerima input
    public static double[] getNumbers(Scanner scanner) {
        double[] numbers = new double[2];
        System.out.print("Masukkan bilangan pertama: ");
        numbers[0] = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        numbers[1] = scanner.nextDouble();
        return numbers;
    }

    // Method untuk menghitung operasi
    public static double calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "+":
                return add(num1, num2);
            case "-":
                return subtract(num1, num2);
            default:
                throw new IllegalArgumentException("Operasi tidak valid: " + operation);
        }
    }

    // Method utama program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator sederhana");

        // Mengambil input bilangan
        double[] numbers = getNumbers(scanner);

        // Mengambil input operasi
        System.out.print("Masukkan operasi (+ atau -): ");
        String operation = scanner.next();

        // Menghitung hasil
        try {
            double result = calculate(numbers[0], numbers[1], operation);
            System.out.println("Hasil: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}