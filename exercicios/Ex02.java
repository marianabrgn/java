package exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Double raio, resultado;

        System.out.println("Digite o valor do raio:");
        raio = sc.nextDouble();

        resultado = Math.PI * (Math.sqrt(raio));
        System.out.printf("%.4f", resultado);

    }
}
