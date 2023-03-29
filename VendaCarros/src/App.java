public class App {
    public static void main(String[] args) throws Exception {
        Carro car = new Carro(2000, 20.000);

        System.out.println("Desconto de: " + car.calculaDesconto());
        System.out.println("Total a Pagar: " + (car.getValor() - car.calculaDesconto()));

    }
}
