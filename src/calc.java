import java.util.Scanner;
import java.util.Stack;
// не смог победить калькулятор, не понимаю, почему он после if не делает вывод результата на консоль

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        Stack<Double> memory = new Stack<>();
        Double num1 = 0.0;
        Double res = 0.0;
        System.out.println("enter first number: ");
        num1 = sc.nextDouble();
        memory.add(num1);
        while (flag) {
            System.out.print("Enter symbol '+-/*' or 'stop' to exit, or 'cansel' to return previos result: ");
            String sing = sc.next();

            System.out.print("enter second number: ");
            Double num2 = sc.nextDouble();
            if (sing.equals("stop")) {
                flag = false;
                if (sing.equals("+")) {
                    res = num1 + num2;
                    System.out.print(res);
                    memory.add(res);
                }
                if (sing.equals("-")) {
                    res = num1 - num2;
                    System.out.println(res);
                    memory.add(res);
                }
                if (sing.equals("*")) {
                    res = num1 * num2;
                    System.out.println(res);
                    memory.add(res);
                }
                if (sing.equals("/")) {
                    if (num2 != 0) {
                        res = num1 / num2;
                        System.out.println(res);
                        memory.add(res);

                    }
                    if (sing.equals("cansel")) {
                        num1 = memory.pop();

                        System.out.println(num1);
                    }
                }
                sc.close();
            }

        }
    }
}