package exercicios1;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numeroFuncionario, horasTrabalhadas;
    float valorHora, salario;

    System.out.println("Digite o número do funcionário: ");
    numeroFuncionario = sc.nextInt();

    System.out.println("Digite o número de horas trabalhadas: ");
    horasTrabalhadas = sc.nextInt();

    System.out.println("Digite o valor de horas trabalhadas: ");
    valorHora = sc.nextFloat();

    salario = horasTrabalhadas * valorHora;

    System.out.printf("O salário do funcionário %d será de: %.2f", numeroFuncionario, salario);
  }

}