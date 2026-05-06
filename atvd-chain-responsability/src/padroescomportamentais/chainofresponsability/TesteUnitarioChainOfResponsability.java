package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioChainOfResponsability {

    AtendenteDono dono;
    AtendenteGerente gerente;
    AtendenteCozinha cozinha;
    AtendenteCaixa caixa;

    @BeforeEach
    public void setUp() {
        dono = new AtendenteDono(null);
        gerente = new AtendenteGerente(dono);
        cozinha = new AtendenteCozinha(gerente);
        caixa = new AtendenteCaixa(cozinha);
    }

    @Test
    public void testCaixaProcessaPedido() {
        Requisicao requisicao = new Requisicao(TipoRequisicaoPedido.getTipoRequisicaoPedido());
        assertEquals("Caixa", caixa.processarRequisicao(requisicao));
    }

    @Test
    public void testCozinhaProcessaReembolso() {
        Requisicao requisicao = new Requisicao(TipoRequisicaoReembolso.getTipoRequisicaoReembolso());
        assertEquals("Cozinha", caixa.processarRequisicao(requisicao));
    }

    @Test
    public void testGerenteProcessaReclamacao() {
        Requisicao requisicao = new Requisicao(TipoRequisicaoReclamacao.getTipoRequisicaoReclamacao());
        assertEquals("Gerente", caixa.processarRequisicao(requisicao));
    }

    @Test
    public void testDonoProcessaFranquia() {
        Requisicao requisicao = new Requisicao(TipoRequisicaoFranquia.getTipoRequisicaoFranquia());
        assertEquals("Dono", caixa.processarRequisicao(requisicao));
    }
}