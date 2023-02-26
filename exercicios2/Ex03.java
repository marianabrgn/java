package exercicios2;

import java.util.Scanner;

public class Ex03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;

    System.out.println("Digite os valores de A e B: ");
    a = sc.nextInt();
    b = sc.nextInt();

    if (a < b) {
      eMultiplo();
    }
    System.out.println("SAO MULTIPLOS");
  }

  public boolean eMultiplo(menor, maior) {
    for (int count = 0; count < maior; count++) {
      if (count * menor == maior) {
        return true;
      }
    }
    return false;   
  }
    
    
}
