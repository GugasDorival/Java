package ex_banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco() {
    }

    //Método construtor 'Diferenciado'
    public ContaBanco(int b_numConta, String b_dono) {
        this.numConta = b_numConta;
        this.dono = b_dono;
        saldo = 0f;
        status = false;
    }

    //Métodos get e set
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    //Métodos personalizados
    public void abrirConta(String tipo_conta){
        setTipo(tipo_conta);
        this.status = true;
        if (getTipo() == "CC"){
            setSaldo(50);
        }else if (getTipo() == "CP"){
            setSaldo(150);
        }else {
            System.out.println("Tipo de conta invalida");
        }
    }

    public void fechar(){
        if (getSaldo() < 0){
            System.out.println("Não é possivel fechar sua conta");
        }else if(getSaldo() > 0){
            System.out.println("Não é possivel fechar sua conta");
        }else{
            setStatus(false);
        }       
    }

    public void depositar(float valor_a_depositar){
        if(isStatus() == false){
            System.out.println("Não é possivel depositar");
        } else{
            setSaldo(getSaldo() + valor_a_depositar);;
            System.out.println("você depositou " + valor_a_depositar);
            System.out.println("\tsaldo atual: " + getSaldo());
        }
    }

    public void sacar(float valor_a_sacar){
        if(isStatus() == false || getSaldo() == 0 || getSaldo() < valor_a_sacar){
            System.out.println("Não é possivel sacar");
        } else{
            setSaldo(getSaldo() - valor_a_sacar);
            System.out.println("Você sacou " + valor_a_sacar);
            System.out.println("\tsaldo atual: " + getSaldo());
        }

    }

    public void pagarMensal(){
        if (getTipo() == "CC"){
            setSaldo(getSaldo() - 12);
        }else if (getTipo() == "CP"){
            setSaldo(getSaldo() - 20);
        }
    }
}
