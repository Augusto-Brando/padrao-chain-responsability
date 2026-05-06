package padroescomportamentais.chainofresponsability;

public class AtendenteGerente extends Atendente {

    public AtendenteGerente(Atendente superior) {
        listaRequisicoes.add(TipoRequisicaoReclamacao.getTipoRequisicaoReclamacao());
        setAtendenteSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}