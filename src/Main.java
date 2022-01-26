public class Main {
    public static void main(String[] args) {
// Dados da pessoa2 1
        Endereco logradouro = new Endereco (12020012);
        logradouro.setNomeRua("Engenheiro");
        logradouro.setBairro("Casa Verde");
        logradouro.setNumeroCasa(140);

        Cliente pessoa = new Cliente();
        pessoa.setNome("isabele");
        pessoa.setEndereco(logradouro);

// Dados da pessoa2 2
        Endereco logradouro2 = new Endereco (19020014);
        logradouro2.setNomeRua("Rua Copacabana");
        logradouro2.setBairro("Chora Menino");
        logradouro2.setNumeroCasa(160);

        Cliente pessoa2 = new Cliente();
        pessoa2.setNome("mariano");
        pessoa2.setEndereco(logradouro2);

       // Transações

        Conta cc = new ContaCorrente(pessoa2);
        cc.depositar(1000);
        Conta poupanca = new ContaPoupanca(pessoa2);
        cc.transferir(500, poupanca);

        Conta ccp1 = new ContaCorrente(pessoa);
        ccp1.depositar(2000);
        Conta poupancap1 = new ContaPoupanca(pessoa);
        ccp1.transferir(200, poupancap1);

        System.out.println("Dados antes da transferência");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        ccp1.imprimirExtrato();
        poupancap1.imprimirExtrato();

        ccp1.transferir(400,cc);

        System.out.println("Dados antes da transferência");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        ccp1.imprimirExtrato();
        poupancap1.imprimirExtrato();

    }
    
}
