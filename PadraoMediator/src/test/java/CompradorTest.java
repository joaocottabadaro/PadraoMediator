
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CompradorTest {

    @Test
    public void deveAvaliarProduto() {
        Comprador consumidor = new Comprador();
        assertEquals("Produto avaliado.\n" +
                        "O comprador respondeu sua avaliacao.\n" +
                        "O usuario Felipe Almeida agredece a sua avaliação de:5",
                consumidor.notaProduto("5"));
    }


    @Test
    public void deveComentarProduto() {
        Comprador consumidor = new Comprador();
        assertEquals("Comentário publicado.\n" +
                        "O Comprador respondeu seu comentário.\n" +
                        "O usuario Felipe Almeida agredece a sua mensagem: qualidade muito boa do produto.",
                consumidor.comentarioProduto("qualidade muito boa do produto."));
    }
}
