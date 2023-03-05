import java.util.Scanner;

public class Ex7_OrdemInversa {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[6];

    System.out.println("Digite 6 números: ");
    for (int i = 0; i < 6; i++) {
      vetor[i] = sc.nextInt();
    }

    System.out.println("Os números que você digitou em ordem inversa são:");
    for (int i = 5; i >= 0; i--) {
      System.out.printf("%d\n", vetor[i]);
    }
  }
}
