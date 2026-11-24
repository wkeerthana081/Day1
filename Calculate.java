import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter operators (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if(b != 0){
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
                sc.close();
        }
    }
}
