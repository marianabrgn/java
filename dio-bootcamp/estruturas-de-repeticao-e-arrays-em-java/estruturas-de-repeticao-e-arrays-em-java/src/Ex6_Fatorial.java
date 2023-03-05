import java.util.Scanner;

public class Ex6_Fatorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero, fatorial = 1;

    System.out.println("Digite um número para calcular seu fatorial:");
    numero = sc.nextInt();

    do {
      fatorial *= numero;
      numero--;
    } while (numero > 1);

    System.out.printf("O fatorial do número que você digitou é: %d", fatorial);
  }
}
