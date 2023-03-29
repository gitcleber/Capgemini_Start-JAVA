public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Invoice fatura = new Invoice(1, "Pen Drive", 12, 154.00f);

        System.out.println("Valor Total: " + fatura.getInvoiceAmount());
    }
}
