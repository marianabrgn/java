import java.util.Scanner;

class Exercicio6 {
    public static void main(String[] args) {

        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        Scanner sc = new Scanner(System.in);
        double PI = 3.14159;

        System.out.println("Digite o valor de A:");
        A = sc.nextDouble();
        System.out.println("Digite o valor de B:");
        B = sc.nextDouble();
        System.out.println("Digite o valor de C:");
        C = sc.nextDouble();

        areaTriangulo = ( A * C ) / 2;
        areaCirculo = PI * Math.pow( C, 2 );
        areaTrapezio = ( A + B ) * C / 2;
        areaQuadrado = Math.pow( B, 2 );
        areaRetangulo = A * B;

        System.out.printf(
                "TRIANGULO: %.3f \nCIRCULO: %.3f \nTRAPEZIO: %.3f \nQUADRADO: %.3f \nRETANGULO: %.3f",
                areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo
        );
    }
}