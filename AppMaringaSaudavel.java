package AEP2021;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AppMaringaSaudavel {
    public static void main(String[] args) {

        // Date date = new Date();
        //SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        
        Exercicio novoExercicio = new Exercicio("Treino de fortalecimento para coluna", "fortalecimento",
                                                10,"todas as idades"); 

        Exercicio novoExercicio2 = new Exercicio("HIIT para iniciantes", "alta intensidade", 7,
                                                  "18-45 anos");

        Exercicio novoExercicio3 = new Exercicio("Cardio de baixo impacto", "aeróbico", 20,
                                                  "18-55 anos");
        
        CalendarioDeExercicios novoDia = new CalendarioDeExercicios("segunda-feira");
        novoDia.addExercicio(novoExercicio);
        novoDia.addExercicio(novoExercicio3);
        CalendarioDeExercicios novoDia2 = new CalendarioDeExercicios("terça-feira");
        novoDia2.addExercicio(novoExercicio2);

        Usuario novoUsuario = new Usuario("Ana", "Nunes", "10/08/1995","ana@gmail.com","******");

        
        System.out.println("\n------- TESTES -------");        
        System.out.println(novoExercicio);
        System.out.println("\n----- CALENDÁRIO -----"); 
        System.out.println(novoDia);
        System.out.println(novoDia2);

        System.out.println("\n------- USUÁRIOS------");
        System.out.println(novoUsuario);
    }
}
