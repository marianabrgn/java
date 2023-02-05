package exercicios1;

import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int codigoPeca1, codigoPeca2, numeroPeca1, numeroPeca2;
    float valorPeca1, valorPeca2, valorTotal;

    System.out.println("Digite o código da peça 1 e 2: ");
    codigoPeca1 = sc.nextInt();
    codigoPeca2 = sc.nextInt();

    System.out.println("Digite o número de peças: ");
    numeroPeca1 = sc.nextInt();
    numeroPeca2 = sc.nextInt();

    System.out.println("Digite o valor da peça 1 e 2: ");
    valorPeca1 = sc.nextFloat();
    valorPeca2 = sc.nextFloat();

    valorTotal = (valorPeca1 * numeroPeca1) + (valorPeca2 * numeroPeca2);

    System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
  }
}
