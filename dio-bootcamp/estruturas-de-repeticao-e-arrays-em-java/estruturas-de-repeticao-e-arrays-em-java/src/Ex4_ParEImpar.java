import java.util.Scanner;

public class Ex4_ParEImpar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int quantidadeNumero;
    int numero, quantidadePares = 0, quantidadeImpares = 0, count = 0;

    System.out.println("Digite a quantidade de números a serem inseridos:");

    quantidadeNumero = sc.nextInt();

    do {
      System.out.println("Digite um número:");
      numero = sc.nextInt();

      if (numero % 2 == 0) {
        quantidadePares++;
      } else {
        quantidadeImpares++;
      }
      count++;
    } while (count < quantidadeNumero);

    System.out.printf("Entre os números que você digitou, %d são pares e %d são ímpares.", quantidadePares,
        quantidadeImpares);
  }

}