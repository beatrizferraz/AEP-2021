package AEP_PERS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class CalendarioDeExercicios extends BaseEntity {
    private String diaDaSemana;   
    //private Usuario usuario;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Exercicio> exercicios = new HashSet<>();

    public CalendarioDeExercicios() {
        super();
    }
    
    public CalendarioDeExercicios(String diaDaSemana) {
        this();
        setDiaDaSemana(diaDaSemana);
    }
 
    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public Set<Exercicio> getExercicio() {
        return exercicios;
    }

    // public Usuario getUsuario() {
    //     return usuario;
    // }
 
    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }
 
    public void addExercicio(Exercicio novoExercicio) {
         this.exercicios.add(novoExercicio);
    }

    public int calculaTempoDeExercicioDiario() { 
        int tempoDeExercicio = 0;
        for(Exercicio e : exercicios) {
            tempoDeExercicio = tempoDeExercicio + e.getTempoEmMinutos(); 
        }
        return tempoDeExercicio;
    }

    public String feedbackTempoDeExercicio() {
        if(calculaTempoDeExercicioDiario() < 30) {
            int diferenca = 0;
            diferenca = 30 - calculaTempoDeExercicioDiario();
            return "Hoje faltaram " + diferenca + " minutos para você chegar ao mínimo ideal de exercício diário. Está tudo bem começar aos poucos. Não desista :)";
        }
        else if (calculaTempoDeExercicioDiario() > 1440)
        {
            throw new RuntimeException("Como você fez mais de 24h de exercício em um dia?");
        }
        return "Bom trabalho!";        
    }
 
    @Override
     public String toString() {
    
         String stringExercicio = "\nEXERCÍCIOS: ";
         for (Exercicio e : this.exercicios) {
             stringExercicio += e.toString() + "; ";
         }

         return  "\nDia da semana: " + diaDaSemana
                 + stringExercicio.substring(0,stringExercicio.length())
                 + "\nTempo total de exercício diário: " + calculaTempoDeExercicioDiario() + " minutos."
                 + "\nFeedback: " + feedbackTempoDeExercicio();
     }
}
