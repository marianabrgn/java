import java.util.Scanner;

public class Ex8_Consoantes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] vetor = new String[6];
    int i = 0, quantidadeConsoante = 0;

    System.out.println("Digite 6 letras:");

    do {
      vetor[i] = sc.next();
      if (vetor[i].equalsIgnoreCase("a") ||
          vetor[i].equalsIgnoreCase("e") ||
          vetor[i].equalsIgnoreCase("i") ||
          vetor[i].equalsIgnoreCase("o") ||
          vetor[i].equalsIgnoreCase("u")) {
        quantidadeConsoante++;
      }
      i++;
    } while (i < 6);

    System.out.printf("%d consoantes foram digitadas.", quantidadeConsoante);
  }
}
