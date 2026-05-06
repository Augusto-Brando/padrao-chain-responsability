package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoPedido implements TipoRequisicao {
    private static TipoRequisicaoPedido tipoRequisicaoPedido = new TipoRequisicaoPedido();
    private TipoRequisicaoPedido() {};

    public static TipoRequisicaoPedido getTipoRequisicaoPedido() {
        return tipoRequisicaoPedido;
    }
}