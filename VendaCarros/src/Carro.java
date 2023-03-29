public class Carro {
    private int anoFabricacao;
    private double valor;

    public Carro(int anoFabricacao, double valor) {
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calculaDesconto() {
        if (this.anoFabricacao <= 2000) {
            return (this.valor * 0.10f);
        }
        return (this.valor * 0.05f);
    }

}
