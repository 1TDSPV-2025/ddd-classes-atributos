public class Cliente {

    String nome;
    String cpf;
    String rmAluno;
    Endereco endereco;

    String retornarDados() {

        String dados = "Nome: " + nome + " Cpf: " + cpf;
        return dados;
    }
}
