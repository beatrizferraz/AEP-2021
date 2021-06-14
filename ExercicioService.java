package AEP_PERS;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExercicioService {
    @Autowired
    private ExercicioRepository repo;

    public void criarExercicios() {
        repo.save(new Exercicio ("Alongamento pós-treino", "alongamento", 12, "todas as idades"));
        repo.save(new Exercicio ("Alongamento para coluna", "alongamento", 8, "todas as idades"));
        repo.save(new Exercicio ("Cardio de baixo impacto", "aeróbico", 20,"18-55 anos"));
        repo.save(new Exercicio ("HIIT para iniciantes", "anaeróbico", 7, "18-40 anos"));
        repo.save(new Exercicio ("Treino de fortalecimento para coluna", "fortalecimento", 10, "todas as idades"));
        repo.save(new Exercicio ("Yoga nível intermediário", "yoga", 25, "todas as idades"));
        repo.save(new Exercicio ("Yoga para iniciantes", "yoga", 22, "todas as idades"));
    }

    public List<Exercicio> getAll() {
        return repo.findAll();
    }
}
