import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o valor da lateral do quadrado: ");
        Float lado = new Scanner(System.in).nextFloat();
        System.out.println("O dobro da área do quadrado é: " + ((lado * lado) * 2) );
    }
}
