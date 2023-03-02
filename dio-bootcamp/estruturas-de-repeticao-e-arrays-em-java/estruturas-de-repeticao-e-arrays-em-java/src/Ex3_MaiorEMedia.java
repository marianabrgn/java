import java.util.Scanner;

public class Ex3_MaiorEMedia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float[] numeros = new float[5];
    float media, soma;

    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Digite um número:");
      numeros[i] = sc.nextFloat();
    }

  }
}