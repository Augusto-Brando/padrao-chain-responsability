package padroescomportamentais.chainofresponsability;

public class TipoRequisicaoReclamacao implements TipoRequisicao {
    private static TipoRequisicaoReclamacao tipoRequisicaoReclamacao = new TipoRequisicaoReclamacao();
    private TipoRequisicaoReclamacao() {};

    public static TipoRequisicaoReclamacao getTipoRequisicaoReclamacao() {
        return tipoRequisicaoReclamacao;
    }
}