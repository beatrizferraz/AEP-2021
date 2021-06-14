package AEP_PERS;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AlimentacaoService {
    @Autowired
    private AlimentacaoRepository repo;

    public void criarAlimentacao() {
        repo.save(new Alimentacao ("Como manter uma alimentação balanceada", "[lorem ipsum]"));
        repo.save(new Alimentacao ("Alimentação para crianças menores de 2 anos", "[lorem ipsum]"));
        repo.save(new Alimentacao ("Sugestões para um café da manhã saudável", "[lorem ipsum]"));
        repo.save(new Alimentacao ("Sugestões para um almoço saudável", "[lorem ipsum]"));
        repo.save(new Alimentacao ("Sugestões para um jantar saudável", "[lorem ipsum]"));
        repo.save(new Alimentacao ("Sugestões de lanchinhos saudaveis", "[lorem ipsum]"));
        repo.save(new Alimentacao ("O que são alimentos ultraprocessados e porque evitá-los", "[lorem ipsum]"));
        
    }

    public List<Alimentacao> getAll() {
        return repo.findAll();
    }
}
