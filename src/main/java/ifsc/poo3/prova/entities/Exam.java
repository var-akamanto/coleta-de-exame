package ifsc.poo3.prova.entities;

import ifsc.poo3.prova.entities.enums.AnalysisType;
import ifsc.poo3.prova.entities.enums.SampleType;
import ifsc.poo3.prova.entities.enums.TargetOrganism;

public class Exam {
    // Identificador único do exame, por exemplo: "150220"
    private String examId;
    // Nome completo do exame, por exemplo: "CULTURA AERÓBIA - FEZES"
    private String fullExamName;
    // Tempo necessário para processar o exame e entregar o resultado, em dias
    private int turnaroundTimeDays;
    // Tipo de amostra utilizada no exame, por exemplo: "Fezes", "Sangue", etc.
    private SampleType sampleType;
    // Tipo de análise realizada, por exemplo: "Cultura", "Pesquisa", etc.
    private AnalysisType analysisType;
    // Organismo ou agente pesquisado no exame, por exemplo: "Bactérias", "Fungos", "BAAR"
    private TargetOrganism targetOrganism;
    // Indica se o exame requer jejum antes da coleta (true = sim, false = não)
    private boolean requiresFasting;


    public Exam(int turnaroundTimeDays, SampleType sampleType, AnalysisType analysisType, TargetOrganism targetOrganism, boolean requiresFasting) {
        this.turnaroundTimeDays = turnaroundTimeDays;
        this.sampleType = sampleType;
        this.analysisType = analysisType;
        this.targetOrganism = targetOrganism;
        this.requiresFasting = requiresFasting;
    }

    public String getExamId() {
        return examId;
    }

    public String getFullExamName() {
        return analysisType.getDescricao() + " - " + sampleType.getDescricao();
    }


    public int getTurnaroundTimeDays() {
        return turnaroundTimeDays;
    }

    public void setTurnaroundTimeDays(int turnaroundTimeDays) {
        this.turnaroundTimeDays = turnaroundTimeDays;
    }

    public SampleType getSampleType() {
        return sampleType;
    }

    public void setSampleType(SampleType sampleType) {
        this.sampleType = sampleType;
    }

    public AnalysisType getAnalysisType() {
        return analysisType;
    }

    public void setAnalysisType(AnalysisType analysisType) {
        this.analysisType = analysisType;
    }

    public TargetOrganism getTargetOrganism() {
        return targetOrganism;
    }

    public void setTargetOrganism(TargetOrganism targetOrganism) {
        this.targetOrganism = targetOrganism;
    }

    public boolean isRequiresFasting() {
        return requiresFasting;
    }

    public void setRequiresFasting(boolean requiresFasting) {
        this.requiresFasting = requiresFasting;
    }


    @Override
    public String toString() {
        return "Exame {" +
                "\n  ID: " + examId +
                "\n  Nome completo: " + getFullExamName() +
                "\n  Organismo alvo: " + (targetOrganism != null ? targetOrganism.getDescricao() : "N/A") +
                "\n  Tempo para resultado (dias): " + turnaroundTimeDays +
                "\n  Requer jejum: " + (requiresFasting ? "Sim" : "Não") +
                "\n}";
    }

}
