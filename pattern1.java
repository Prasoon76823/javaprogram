import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
