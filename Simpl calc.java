import  java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
        String operator = scanner.next();
        float numB = scanner.nextFloat();
        long a;
        a = (long) Math.abs(num);
        long b;
        b = (long) Math.abs(numB);
        switch (operator) {
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Division by 0!");
                    break;
                } else {
                    System.out.println(a / b);
                } break;
            case "+":
                System.out.println(a + b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}