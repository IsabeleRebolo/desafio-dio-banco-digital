import java.util.Random;

public class Cliente {

    private String nome;
    private Endereco endereco;
    private int chavePix;

    public Cliente() {
        Random gerador = new Random();
        this.chavePix= gerador.nextInt(999999999);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getChavePix() {
        return chavePix;
    }
}
