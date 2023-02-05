package exercicios1;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;

        System.out.println("Digite o primeiro número: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = sc.nextInt();
        resultado = numero1 + numero2;
        System.out.println("SOMA = " + resultado);

    }
}
