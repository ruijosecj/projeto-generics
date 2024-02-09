

public class Carro {
    private int anoFabricacao;
    private String modelo;
    private String fabricante;
    private int numeroPortas;
    
    public Carro(int anoFabricacao, String modelo, String fabricante, int numeroPortas) {
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.numeroPortas = numeroPortas;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public int getNumeroPortas() {
        return numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
      
}
