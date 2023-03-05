import java.util.Scanner;

public class Ex3_MaiorEMedia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float[] numeros = new float[5];
    float media, soma = 0, maior = 0;

    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Digite um número:");
      numeros[i] = sc.nextFloat();
      soma += numeros[i];
      if (maior < numeros[i]) {
        maior = numeros[i];
      }
    }
    media = soma / 5;

    System.out.printf("O maior número é %.2f e a media dos números é %.2f", maior, media);
  }
}