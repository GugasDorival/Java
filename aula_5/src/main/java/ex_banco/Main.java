package ex_banco;

public class Main {
    public static void main(String[] args) {
        ContaBanco Conta1 = new ContaBanco(123456789, "Judas");
        ContaBanco Conta2 = new ContaBanco(987654321, "Carlos");


        Conta1.abrirConta("CC");
        Conta2.abrirConta("CP");

        System.out.println("Dono conta 1: " + Conta1.getDono());
        System.out.println("Dono conta 2: " + Conta2.getDono());
        System.out.println("Número da conta 1: " + Conta1.getNumConta());
        System.out.println("Número da conta 2: " + Conta2.getNumConta());
        System.err.println("A conta 1 está ativa?\t" + Conta1.isStatus());
        System.err.println("A conta 2 está ativa?\t" + Conta2.isStatus());
        System.out.println("Tipo da conta 1: " + Conta1.getTipo());
        System.out.println("Tipo da conta 2: " + Conta2.getTipo());

        System.out.println("Saldo da conta 1: " + Conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + Conta2.getSaldo());

        Conta1.depositar(150);
        Conta2.depositar(200);

        System.out.println("Saldo da conta 1 pós depósito: " + Conta1.getSaldo());
        System.out.println("Saldo da conta 2 pós depósito: " + Conta2.getSaldo());

        Conta1.sacar(2000);
        Conta2.sacar(20);

        System.out.println("Saldo da conta 2 pós saque: " + Conta2.getSaldo());

        Conta1.pagarMensal();
        Conta2.pagarMensal();

        System.out.println("Saldo da conta 1 pós Pagamento Mensal: " + Conta1.getSaldo());
        System.out.println("Saldo da conta 2 pós Pagamento Mensal: " + Conta2.getSaldo());

        Conta1.fechar();

        Conta2.sacar(310);

         Conta2.fechar();

        System.err.println("A conta 1 está ativa?\t" + Conta1.isStatus());
        System.err.println("A conta 2 está ativa?\t" + Conta2.isStatus());






    }
}