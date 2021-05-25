package AEP2021;

public class Alimentacao {
    private String nomeDoTopico;
    private String conteudo;

    public Alimentacao(String nomeDoTopico, String conteudo) {
        setNomeDoTopico(nomeDoTopico);
        setConteudo(conteudo);
    }

    public String getNomeDoTopico() {
        return nomeDoTopico;
    }

    public String getConteudo() {
        return conteudo;
    }

    
    public void setNomeDoTopico(String nomeDoTopico) {
        if(nomeDoTopico == null) {
            throw new RuntimeException("Tópico deve ser informado.");
        }
        this.nomeDoTopico = nomeDoTopico;
    }

    public void setConteudo(String conteudo) {
        if(conteudo == null) {
            throw new RuntimeException("Conteúdo não pode estar em branco.");
        }    
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Tópico: " + nomeDoTopico + "\n"
                + "Conteudo: " + conteudo;
    }
}
