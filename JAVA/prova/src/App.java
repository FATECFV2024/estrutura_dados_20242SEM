import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] idades = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<idades.length; i++){
            System.out.println("Digite  a sua idade: ");
            idades[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(idades));
    }
}
