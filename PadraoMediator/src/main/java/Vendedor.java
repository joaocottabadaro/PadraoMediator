public class Vendedor implements Produto {

    private static Vendedor instancia = new Vendedor();

    private Vendedor() {}

    public static Vendedor getInstancia() {
        return instancia;
    }
    @Override
    public String receberComentario(String mensagem) {
        return "O usuario Felipe Almeida agredece a sua mensagem: " + mensagem;
    }

    @Override
    public String receberNota(String mensagem) {
        return "O usuario Felipe Almeida agredece a sua avaliação de:" + mensagem;
    }

}
