import java.util.Scanner;

class Exercicio3 {
    public static void main(String[] args) {
        Integer A,B,C,D, diferenca;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        A = sc.nextInt();
        System.out.println("Digite o valor de B:");
        B = sc.nextInt();
        System.out.println("Digite o valor de C:");
        C = sc.nextInt();
        System.out.println("Digite o valor de D:");
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);
    }
}