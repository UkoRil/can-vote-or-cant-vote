import java.util.Scanner;
public class canvotecantvote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int age = scanner.nextInt();
        System.out.println((age >= 18) ? 1 : 0);
    }
}