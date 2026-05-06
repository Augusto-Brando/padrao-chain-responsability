package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoReembolso implements TipoRequisicao {
    private static TipoRequisicaoReembolso tipoRequisicaoReembolso = new TipoRequisicaoReembolso();
    private TipoRequisicaoReembolso() {};

    public static TipoRequisicaoReembolso getTipoRequisicaoReembolso() {
        return tipoRequisicaoReembolso;
    }
}