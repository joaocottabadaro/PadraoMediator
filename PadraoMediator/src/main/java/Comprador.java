public class Comprador {

    public String comentarioProduto(String mensagem) {
        return Olx.getInstancia().receberComentarioComprador(mensagem);
    }

    public String notaProduto(String mensagem) {
        return Olx.getInstancia().receberNotaProduto(mensagem);
    }


}
