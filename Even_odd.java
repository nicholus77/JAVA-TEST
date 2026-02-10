import java.util.*;

class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
}
