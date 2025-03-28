import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a,b,c,res;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a: ");
        a=obj.nextInt();
        System.out.println("Enter b: ");
        b=obj.nextInt();
        System.out.println("Enter c: ");
        c=obj.nextInt();
        res=(a>b?a>c?a:c:b>c?b:c);
        System.out.println("Largest: "+res);
    }
}

//************************************************************** 
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a,b,c,res;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a: ");
        a=obj.nextInt();
        System.out.println("Enter b: ");
        b=obj.nextInt();
        System.out.println("Enter c: ");
        c=obj.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("Largest: "+a);
        }
        else if(b>a&&b>c)
        {
            System.out.println("Largest: "+b);
        }
        else
        {
            System.out.println("Largest: "+c);
        }
        
    }
}