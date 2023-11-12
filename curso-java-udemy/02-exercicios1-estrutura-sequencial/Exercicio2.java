import java.util.Scanner;

class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double PI = 3.14159;
        double raioCirculo, resultado;


        System.out.println("Digite o valor do raio de um círculo:");
        raioCirculo = sc.nextDouble();

        resultado = PI * (Math.pow(raioCirculo, 2));

        System.out.printf("A = %.4f", resultado);
    }
}