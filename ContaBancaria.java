public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String nomeTitular;

    public ContaBancaria(int numeroConta, double saldo, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso! Seu novo saldo é: " + this.saldo);
        } else {
            System.out.println("Valor inválido para depósito. Digite um valor maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Seu novo saldo é: " + this.saldo);
        } else {
            System.out.println("Valor inválido para saque. Digite um valor maior que zero e menor ou igual ao seu saldo.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: " + this.saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(12345, 1000.00, "João Silva");

        conta1.depositar(500.00);
        conta1.sacar(200.00);
        conta1.consultarSaldo();
    }
}
