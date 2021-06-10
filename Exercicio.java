package AEP2021;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
    private String nome;
    private String tipo;
    private int tempoEmMinutos;
    private String faixaEtaria;
    

    public Exercicio(String nome, String tipo, int tempoEmMinutos, String faixaEtaria) {
        setNome(nome);
        setTipo(tipo);
        setTempoEmMinutos(tempoEmMinutos);
        setFaixaEtaria(faixaEtaria);
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTempoEmMinutos() {
        return tempoEmMinutos;
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

    public void setTempoEmMinutos(int tempoEmMinutos) {  
        this.tempoEmMinutos = tempoEmMinutos;
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
                + "Duração: " + tempoEmMinutos + " minutos \n"
                + "Faixa etária: " + faixaEtaria;
    }
}
