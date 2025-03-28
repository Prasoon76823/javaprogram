import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a: ");
        a=obj.nextInt();
        System.out.println("Enter b: ");
        b=obj.nextInt();
        c=a+b;
        System.out.println("Sum: "+c);
    }
}