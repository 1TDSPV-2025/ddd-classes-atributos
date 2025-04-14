public class Endereco {

    String logradouro;
    short numero;
    String complemento;
    String cep;
    String cidade;


    String retornarEndereco() {

        String endereco = logradouro + " " + numero + " " + complemento + " " + cep;
        return endereco;
    }
}
