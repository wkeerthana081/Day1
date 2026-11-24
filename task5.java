import java.util.Scanner;

class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }
        if (n == reverse)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
        if (n == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}