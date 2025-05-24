package ifsc.poo3.prova.entities.enums;

public enum TargetOrganism {
    BACTERIA("BACTÉRIA"),
    FUNGO("FUNGO"),
    VIRUS("VÍRUS"),
    PARASITA("PARASITA"),
    MICOBACTERIA("MICOBACTÉRIA"),
    HELMINTO("HELMINTO"),
    PROTOZOARIO("PROTOZOÁRIO"),
    CLAMIDIA("CLAMÍDIA"),
    MICOPLASMA("MICOPLASMA"),
    RIQUETSIA("RIQUETSIA"),
    OUTRO("OUTRO");

    private final String descricao;

    TargetOrganism(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
