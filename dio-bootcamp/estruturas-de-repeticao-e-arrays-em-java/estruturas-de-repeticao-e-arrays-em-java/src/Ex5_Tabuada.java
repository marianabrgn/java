import java.util.Scanner;

public class Ex5_Tabuada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tabuada;

    System.out.println("Informe a tabuada:");
    tabuada = sc.nextInt();

    System.out.printf("Tabuada de %d:\n", tabuada);
    for (int i = 1; i <= 10; i++) {
      int numero = tabuada * i;
      System.out.printf("%d X %d = %d\n", tabuada, i, numero);
    }
  }
}
