import java.util.Scanner;

class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario, valorHora;
        Integer numeroFuncionario, horasTrabalhadas;

        System.out.println("Digite o número do funcionário:");
        numeroFuncionario = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas:");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor da hora:");
        valorHora = sc.nextDouble();

        salario = valorHora * horasTrabalhadas;
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);

    }
}