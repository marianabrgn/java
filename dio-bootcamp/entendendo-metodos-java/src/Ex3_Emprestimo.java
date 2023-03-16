import java.util.Scanner;

public class Ex3_Emprestimo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double valorEmprestimo;
    int anos;

    System.out.println("Digite o valor do emprestimo: ");
    valorEmprestimo = sc.nextDouble();
    System.out.println("Digite o tempo em anos do pagamento: ");
    anos = sc.nextInt();

    double emprestimo = calcularEmprestimo(valorEmprestimo, anos);
    System.out.printf("O valor total com juros do emprestimo solicitado será de %.2f", emprestimo);
  }

  public static double calcularEmprestimo(double valorEmprestimo, int anos) {
    double emprestimo;

    emprestimo = valorEmprestimo * (Math.pow((1 + 0.03), anos));

    return emprestimo;
  }

}
