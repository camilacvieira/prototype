public class Funcionario implements Cloneable{
    private long cpf;
    private String nome;
    private Endereco endereco;
    private String cargo;

    public Funcionario(long cpf, String nome, Endereco endereco, String cargo) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.cargo = cargo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getLocalCargo() {
        return cargo;
    }

    public void setLocalCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public Funcionario clone() throws CloneNotSupportedException {
        Funcionario funcionarioClone = (Funcionario) super.clone();
        funcionarioClone.endereco = (Endereco) funcionarioClone.endereco.clone();
        return funcionarioClone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
