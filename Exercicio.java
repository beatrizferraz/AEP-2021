package AEP2021;

public class Exercicio {
    private String nome;
    private String tipo;
    private String tempoDeDuracao;
    private String faixaEtaria;

    public Exercicio(String nome, String tipo, String tempoDeDuracao, String faixaEtaria) {
        setNome(nome);
        setTipo(tipo);
        setTempoDeDuracao(tempoDeDuracao);
        setFaixaEtaria(faixaEtaria);
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().length() == 0) {
            throw new RuntimeException("Todo exercício deve apresentar nome.");
        }    
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        if(tipo == null || tipo.trim().length() == 0) {
            throw new RuntimeException("Todo exercício deve apresentar tipo.");
        }       
        this.tipo = tipo;
    }

    public void setTempoDeDuracao(String tempoDeDuracao) {
        if(tempoDeDuracao == null || tempoDeDuracao.trim().length() == 0) {
            throw new RuntimeException("Todo exercício deve informar tempo de duração.");
        }   
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        if(faixaEtaria == null || faixaEtaria.trim().length() == 0) {
            throw new RuntimeException("Todo exercício deve informar a faixa etária para qual é recomendado");
        }   
        this.faixaEtaria = faixaEtaria;
    }

    @Override
    public String toString() {
        return "\nExercício: " + nome + "\n" 
                + "Tipo: " + tipo + "\n"
                + "Duração: " + tempoDeDuracao + "\n"
                + "Faixa etária: " + faixaEtaria;
    }
}
