package AEP_PERS;

import javax.persistence.Entity;

@Entity
public class Alimentacao extends BaseEntity{
    private String nomeDoTopico;
    private String conteudo;

    public Alimentacao() {
        super();
    }
    
    public Alimentacao(String nomeDoTopico, String conteudo) {
        this();
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
                + "Conteúdo: " + conteudo;
    }
}
