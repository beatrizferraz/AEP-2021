package AEP_PERS;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarioDeExerciciosRepository extends JpaRepository<CalendarioDeExercicios, String> {
    
    void save(Exercicio exercicio);

    //void save(Usuario usuario);
}
