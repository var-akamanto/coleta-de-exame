package ifsc.poo3.prova.entities.enums;

public enum AnalysisType {
        CULTURA_AEROBIA("CULTURA AERÓBIA"),
        PESQUISA("PESQUISA"),
        ISOLAMENTO("ISOLAMENTO"),
        SENSIBILIDADE("SENSIBILIDADE"),
        OUTRO("OUTRO");

        private final String descricao;

        AnalysisType(String descricao) {
                this.descricao = descricao;
        }

        public String getDescricao() {
                return descricao;
        }
}
