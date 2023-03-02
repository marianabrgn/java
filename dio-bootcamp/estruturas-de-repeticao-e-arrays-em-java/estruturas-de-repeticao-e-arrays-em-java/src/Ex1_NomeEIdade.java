import java.util.Scanner;

public class Ex1_NomeEIdade {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int idade;
    String nome;

    while (true) {

      System.out.println("Digite seu nome:");
      nome = sc.next();
      if (nome.equals("0")) {
        break;
      }
      System.out.println("Digite sua idade:");
      idade = sc.nextInt();
      if (idade == 0) {
        break;
      }
      System.out.printf("Seu nome é %s, e sua idade é %d. \n", nome, idade);
    }
  }
}