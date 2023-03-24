public class Veiculo {
  String modelo;
  String marca;
  String cor;
  String placa;
  Boolean ligado;
  Boolean parado;

  public Veiculo() {

  }

  public void setLigar(Boolean ligado) {
    this.ligado = ligado;
  }

  public void setParar(Boolean parado) {
    this.parado = parado;
  }

  public String getEstado() {
    if (this.parado) {
      return "parado";
    }

    return "ligado";
  }
}
