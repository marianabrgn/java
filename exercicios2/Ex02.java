package exercicios2;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.println("Digite um número: ");
    numero = sc.nextInt();

    if (numero % 2 == 0) {
      System.out.println("PAR");
    } else {
      System.out.println("IMPAR");
    }
  }
}
