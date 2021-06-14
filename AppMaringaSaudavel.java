package AEP_PERS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppMaringaSaudavel implements CommandLineRunner  {
    @Autowired
    private AlimentacaoService alimentacaoService;

    @Autowired
    private ExercicioService exercicioService;

    @Autowired 
    private CalendarioDeExerciciosService calendarioDeExerciciosService;

    @Autowired
    private UsuarioService usuarioService;

    public static void main(String[] args) {
   
        SpringApplication.run(AppMaringaSaudavel.class, args).close();;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------- Alimentacao -------------------");
        alimentacaoService.criarAlimentacao();

        for (Alimentacao a : alimentacaoService.getAll()) {
            System.out.println("Informações sobre alimentação: \n" + a);
        }

        System.out.println("---------------- Exercicios -------------------");
        exercicioService.criarExercicios();

        for (Exercicio e : exercicioService.getAll()) {
            System.out.println(e);
        }

        System.out.println("---------------- Calendário -------------------");
        calendarioDeExerciciosService.criarCalendario();

        for (CalendarioDeExercicios c : calendarioDeExerciciosService.getAll()) {
            System.out.println(c.toString());
        }

        System.out.println("---------------- Usuarios -------------------");
        usuarioService.criarUsuarios();

        for (Usuario u: usuarioService.getAll()) {
            System.out.println(u);
        }
    }   
}

