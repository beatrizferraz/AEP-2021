package AEP2021;

import java.util.ArrayList;
import java.util.List;

public class CalendarioDeExercicios {
    private String diaDaSemana;
    private List<Exercicio> exercicio = new ArrayList<>();
    
    public CalendarioDeExercicios(String diaDaSemana) {
        setDiaDaSemana(diaDaSemana);
    }
 
    public String getDiaDaSemana() {
        return diaDaSemana;
    }
 
    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }
 
    public void addExercicio(Exercicio novoExercicio) {
         this.exercicio.add(novoExercicio);
    }
 
    @Override
     public String toString() {
    
         String stringExercicio = "\nEXERCICIOS: ";
         for (Exercicio e : this.exercicio) {
             stringExercicio += e.toString() + "; ";
         }
 
         return  "\nDia da semana: " + diaDaSemana
                 + stringExercicio.substring(0,stringExercicio.length());
     }
 } 
