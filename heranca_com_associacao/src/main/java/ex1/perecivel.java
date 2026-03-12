package ex1;

public class perecivel extends produto{
    private String data_validade;
    private String cidade_origem;

    public perecivel(){

    }

    public perecivel(String data_validade, String cidade_origem){
        this.data_validade=data_validade;
        this.cidade_origem=cidade_origem;
    }
    public String getData_validade() {
        return data_validade;
    }
    public void setData_validade(String data_validade) {
        this.data_validade = data_validade;
    }

    public String getCidade_origem() {
        return cidade_origem;
    }
    public void setCidade_origem(String cidade_origem) {
        this.cidade_origem = cidade_origem;
    }

}
