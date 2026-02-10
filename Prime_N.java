import java.util.Scanner;

class Prime_N {
    public static void main(String[] args) {
    int n,count=0;
    Scanner get =new Scanner(System.in);
    System.out.println("Enter the Number :");
    n=get.nextInt();
    
    for(int i=1;i<=n;i++)
    	if(n%i==0)
    	count++;
    System.out.println(count==2?" Prime "+n:"Not a Prime is "+n);
    }
}
