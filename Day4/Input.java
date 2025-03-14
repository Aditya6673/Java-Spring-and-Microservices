import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
public class Input {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(input);
        int num = Integer.parseInt(bf.readLine());
        System.out.println("You entered: " + num);
        bf.close();
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("You entered: " + num);
        sc.close();
    }
}
