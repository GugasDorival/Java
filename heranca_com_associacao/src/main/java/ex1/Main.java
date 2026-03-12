package ex1;

public class Main {
    public static void main(String[] args) {
        produto batata = new perecivel("20/07/2026", "Salto");
        batata.setValor_unit(2);
        produto cadeira = new permanente(0.8, true);
        cadeira.setValor_unit(200);
        produto carne = new perecivel("15/03/2026", "Campinas");
        carne.setValor_unit(143);
        produto lapis = new permanente(0.5, false);
        lapis.setValor_unit(3);

        pedido batata_pedido = new pedido(1234, "18/12/2026", 7, batata);
        pedido cadeira_pedido = new pedido(5678, "24/03/2027", 3, cadeira);
        pedido carne_pedido = new pedido(91011, "09/07/2026", 1, carne);
        pedido lapis_pedido = new pedido(1213, "30/11/2026", 358, lapis);

        System.out.println("Pedido 01: "+ batata_pedido.calcValorTotal()); 
        System.out.println("\nPedido 02: "+ cadeira_pedido.calcValorTotal()); 
        System.out.println("\nPedido 03: "+ carne_pedido.calcValorTotal()); 
        System.out.println("\nPedido 04: "+ lapis_pedido.calcValorTotal()); 
    }
}