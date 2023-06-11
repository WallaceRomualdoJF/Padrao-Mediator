import org.example.wallace.ExemploOuvinte;
import org.example.wallace.MediadorEventos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediadorEventosTest {

    private MediadorEventos mediador;
    private ExemploOuvinte ouvinte1;
    private ExemploOuvinte ouvinte2;

    @BeforeEach
    void setUp() {
        mediador = new MediadorEventos();
        ouvinte1 = new ExemploOuvinte("Ouvinte 1");
        ouvinte2 = new ExemploOuvinte("Ouvinte 2");
    }

    @Test
    void testInscricaoEPublicacaoDeEvento() {
        // Inscricao de ouvintes
        mediador.inscrever("eventoExemplo", ouvinte1);
        mediador.inscrever("eventoExemplo", ouvinte2);

        // Publicacao de evento
        mediador.publicar("eventoExemplo", "Dados do evento");

        // Verificacao se os ouvintes receberam o evento
        assertFalse(ouvinte1.foiChamado());
        assertFalse(ouvinte2.foiChamado());
    }

    @Test
    void testCancelamentoDeInscricao() {
        // Inscricao de ouvintes
        mediador.inscrever("eventoAcaoRealizada", ouvinte1);
        mediador.inscrever("eventoAcaoRealizada", ouvinte2);

        // Cancelamento da inscricao do ouvinte 2
        mediador.cancelarInscricao("eventoAcaoRealizada", ouvinte2);

        // Publicacao de evento
        mediador.publicar("eventoAcaoRealizada", "Acao realizada");

        // Verificacao se apenas o ouvinte 1 recebeu o evento
        assertFalse(ouvinte1.foiChamado());
    }

    @Test
    void testPublicacaoDeEventoNaoRegistrado() {
        // Publicacao de evento nao registrado
        mediador.publicar("eventoNaoRegistrado", "Dados do evento");

        // Verificacao se nenhum ouvinte recebeu o evento
        assertFalse(ouvinte1.foiChamado());
        assertFalse(ouvinte2.foiChamado());
    }
}