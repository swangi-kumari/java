import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        //take input of 2 no. and print the sum
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a+ b;
        return sum;
    }

    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd no: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd no: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
