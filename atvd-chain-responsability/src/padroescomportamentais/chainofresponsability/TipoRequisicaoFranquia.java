package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoFranquia implements TipoRequisicao {
    private static TipoRequisicaoFranquia tipoRequisicaoFranquia = new TipoRequisicaoFranquia();
    private TipoRequisicaoFranquia() {};

    public static TipoRequisicaoFranquia getTipoRequisicaoFranquia() {
        return tipoRequisicaoFranquia;
    }
}