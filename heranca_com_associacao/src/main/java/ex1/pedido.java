package ex1;

public class pedido {
    private int codigo;
    private String data_pedido;
    private int quantidade;
    private produto produto;

    public pedido(){

    }

    public pedido(int codigo, String data_pedido, int quantidade, produto produto){
        this.codigo=codigo;
        this.data_pedido=data_pedido;
        this.quantidade=quantidade;
        this.produto=produto;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData_pedido() {
        return data_pedido;
    }
    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public produto getProduto() {
        return produto;
    }
    public void setProduto(produto produto) {
        this.produto = produto;
    }

    public double calcValorTotal() {
        if (produto instanceof permanente){
            permanente prodPermanente=(permanente)produto; //Castisg 
                        
            return (produto.getValor_unit()*quantidade)*prodPermanente.getPerc_desvalorizacao();
        }

        return produto.getValor_unit()*quantidade;
    }
}