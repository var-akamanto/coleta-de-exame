package ifsc.poo3.prova.entities.enums;

public enum SampleType {
    FEZES("FEZES"),
    SANGUE("SANGUE"),
    URINA("URINA"),
    SECRECAO("SECREÇÃO"),
    LIQUIDO_CEFALORRAQUIDIANO("LÍQUIDO CEFALORRAQUIDIANO"),
    ESPUTO("ESPÚTO"),
    TECIDO("TECIDO"),
    OUTRO("OUTRO");

    private final String descricao;

    SampleType(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
