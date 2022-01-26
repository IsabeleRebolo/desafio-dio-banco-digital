public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

//    public Conta(ContaPoupancaCliente cliente) {
//
//    }



    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

        @Override
        public void sacar(double valor) {
        saldo = saldo - valor;
        }

    @Override
    public void depositar(double valor) {
        saldo= saldo + valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {


    }

    // métodos
    public void sacar(){

    }

    public void depositar(){

    }

    public void transferir(){

    }

    public int getagencia(){
        return agencia;
    }

    public int getnumero(){
        return numero;
    }
    public double getsaldo(){
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular:%s", this.cliente.getNome()));
        System.out.println(String.format("Agencia:%d", this.agencia));
        System.out.println(String.format("Numero:%d", this.numero));
        System.out.println(String.format("Saldo:%.2f", this.saldo));
        System.out.println(String.format("Endereco: %s - %d, %s, %d", this.cliente.getEndereco().getNomeRua(), this.cliente.getEndereco().getNumeroCasa(),
                this.cliente.getEndereco().getBairro(), this.cliente.getEndereco().getCEP()));
        System.out.println(String.format("Sua chave PIX é:%d", this.cliente.getChavePix()));
    }
}
