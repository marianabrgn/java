import java.util.Scanner;

class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer codigoPeca1, codigoPeca2, numeroPeca1, numeroPeca2;
        double valorUnitario1, valorUnitario2, valorPagar;

        System.out.println("Digite o código da peça 1:");
        codigoPeca1 = sc.nextInt();
        System.out.println("Digite o número de peças 1:");
        numeroPeca1 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 1:");
        valorUnitario1 = sc.nextDouble();

        System.out.println("Digite o código da peça 2:");
        codigoPeca2 = sc.nextInt();
        System.out.println("Digite o número de peças 2:");
        numeroPeca2 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 2:");
        valorUnitario2 = sc.nextDouble();

        valorPagar = (numeroPeca1 * valorUnitario1) + (numeroPeca2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);



    }
}