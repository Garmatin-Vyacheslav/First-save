import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double operand1 = scanner.nextDouble();
        double result = operand1;
        while (true) {
            System.out.print("Введите операцию (+, -, *, /) или 'C' для выхода: ");
            char operator = scanner.next().charAt(0);
            if (operator == 'C') {
                break;
            }
            System.out.print("Введите следующее число: ");
            double operand2 = scanner.nextDouble();
            switch (operator) {
                case '+':
                    result += operand2;
                    break;
                case '-':
                    result -= operand2;
                    break;
                case '*':
                    result *= operand2;
                    break;
                case '/':
                    result /= operand2;
                    break;
                default:
                    System.out.println("Ошибка! Неверный оператор.");
                    return;
            }
            System.out.println("Результат: " + result);
        }
        System.out.println("Конечный результат: " + result);
    }
}
