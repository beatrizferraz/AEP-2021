package AEP2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CalendarioDeExercicios {
    private String diaDaSemana;
    private List<Exercicio> exercicio = new ArrayList<>();
    private Usuario usuario;
    
    public CalendarioDeExercicios(String diaDaSemana) {
        setDiaDaSemana(diaDaSemana);
    }
 
    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public List<Exercicio> getExercicio() {
        return exercicio;
    }

    public Usuario getUsuario() {
        return usuario;
    }
 
    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }
 
    public void addExercicio(Exercicio novoExercicio) {
         this.exercicio.add(novoExercicio);
    }

    public int calculaTempoDeExercicioDiario() { 
        int tempoDeExercicio = 0;
        for(Exercicio e : exercicio) {
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
         for (Exercicio e : this.exercicio) {
             stringExercicio += e.toString() + "; ";
         }

         return  "\nDia da semana: " + diaDaSemana
                 + stringExercicio.substring(0,stringExercicio.length())
                 + "\nTempo total de exercício diário: " + calculaTempoDeExercicioDiario() + " minutos."
                 + "\nFeedback: " + feedbackTempoDeExercicio();
     }
 } 
