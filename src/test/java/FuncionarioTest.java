
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Funcionario funcionario = new Funcionario(1234567890, "Funcionario Original", new Endereco("Rua A", 1), "gerente");

        Funcionario funcionarioClone = funcionario.clone();
        funcionarioClone.setCpf(11);
        funcionarioClone.setNome("Funcionario Clonado");
        funcionarioClone.getEndereco().setNumero(2);

        assertEquals("Funcionario{cpf=1234567890, nome='Funcionario Original', endereco=Endereco{logradouro='Rua A', numero=1}, cargo='gerente'}", funcionario.toString());
        assertEquals("Funcionario{cpf=11, nome='Funcionario Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, cargo='gerente'}", funcionarioClone.toString());
    }
}