public class Olx {


    private static Olx instancia = new Olx();

    private Olx() {}

    public static Olx getInstancia() {
        return instancia;
    }


    public String receberNotaProduto(String mensagem) {
        return "Produto avaliado.\n"+
                "O comprador respondeu sua avaliacao.\n" +
                Vendedor.getInstancia().receberNota(mensagem);
    }

    public String receberComentarioComprador(String mensagem) {
        return "Comentário publicado.\n"+
                "O Comprador respondeu seu comentário.\n"
                 + Vendedor.getInstancia().receberComentario(mensagem);
    }

}
