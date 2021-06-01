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
