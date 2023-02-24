package exercicios2;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.println("Digite um número: ");
    numero = sc.nextInt();

    if (numero > 0) {
      System.out.println("NÃO NEGATIVO");
    } else {
      System.out.println("NEGATIVO");
    }
  }
}