import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer valor1, valor2, soma;

        System.out.println("Digite o primeiro valor:");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = sc.nextInt();

        soma = valor1 + valor2;

        System.out.println("SOMA = " + soma);
    }
}