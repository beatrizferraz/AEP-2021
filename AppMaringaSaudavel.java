package AEP2021;

public class AppMaringaSaudavel {
    public static void main(String[] args) {
        
        Exercicio novoExercicio = new Exercicio("Treino de fortalecimento para coluna", "fortalecimento",
                                                "10 minutos","todas as idades"); 

        Exercicio novoExercicio2 = new Exercicio("HIIT para iniciantes", "alta intensidade", "7 minutos",
                                                  "18-45 anos");

        Exercicio novoExercicio3 = new Exercicio("Cardio de baixo impacto", "aeróbico", "20 minutos",
                                                  "18-55 anos");
        
        CalendarioDeExercicios novoDia = new CalendarioDeExercicios("segunda-feira");
        novoDia.addExercicio(novoExercicio);
        novoDia.addExercicio(novoExercicio3);
        CalendarioDeExercicios novoDia2 = new CalendarioDeExercicios("terça-feira");
        novoDia2.addExercicio(novoExercicio2);

        
        System.out.println("\n------- TESTES ------- \n");
        
        //System.out.println(novoExercicio);
        System.out.println(novoDia);
        System.out.println(novoDia2);
    }
}
