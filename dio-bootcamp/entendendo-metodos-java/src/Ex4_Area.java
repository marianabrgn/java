public class Ex4_Area {

  public static int calcularArea(int lado) {
    int area = lado * 2;

    return area;
  }

  public static int calcularArea(int lado, int lado2) {
    int area = lado * lado2;

    return area;
  }

  public static int calcularArea(int ladoMaior, int ladoMenor, int altura) {
    int area = ((ladoMaior * ladoMenor) * altura) / 2;

    return area;
  }

}
