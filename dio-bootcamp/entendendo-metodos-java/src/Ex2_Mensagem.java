import java.util.Calendar;

public class Ex2_Mensagem {
  public static void main(String[] args) {
    menssagem();
  }

  public static void menssagem() {
    Calendar c = Calendar.getInstance();
    int hora = c.get(Calendar.HOUR_OF_DAY);

    if (hora >= 6 && hora <= 12) {
      System.out.println("Bom dia!");
    } else if (hora > 12 && hora <= 18) {
      System.out.println("Boa Tarde!");
    } else {
      System.out.println("Boa Noite!");
    }
  }
}
