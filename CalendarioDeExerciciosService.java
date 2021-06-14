package AEP_PERS;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class CalendarioDeExerciciosService {
    @Autowired
    private CalendarioDeExerciciosRepository repo;

    public void criarCalendario() {
        CalendarioDeExercicios c = new CalendarioDeExercicios("segunda-feira");
        Exercicio e = new Exercicio("Cardio de baixo impacto", "aeróbico", 20,"18-55 anos");
        c.addExercicio(e);
        repo.save(c);

        c = new CalendarioDeExercicios("terça-feira");
        e = new Exercicio("Cardio de baixo impacto", "aeróbico", 20,"18-55 anos");
        Exercicio e1 = new Exercicio("Alongamento pós-treino", "alongamento", 12, "todas as idades");
        c.addExercicio(e);
        c.addExercicio(e1);
        repo.save(c);

        c = new CalendarioDeExercicios("quarta-feira");
        e = new Exercicio("Yoga nível intermediário", "yoga", 25, "todas as idades");
        c.addExercicio(e);
        repo.save(c);

        c = new CalendarioDeExercicios("quinta-feira");
        e = new Exercicio("Cardio de baixo impacto", "aeróbico", 20,"18-55 anos");
        e1 = new Exercicio("Yoga nível intermediário", "yoga", 25, "todas as idades");
        c.addExercicio(e);
        c.addExercicio(e1);
        repo.save(c);
    }

    public List<CalendarioDeExercicios> getAll() {
        return repo.findAll();
    }
}
