package AEP_PERS;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    private UsuarioRepository repo;

    public void criarUsuarios() {
        repo.save(new Usuario("Ana", "Nunes", "10/08/1995","ana@gmail.com","******"));
        repo.save(new Usuario("Bianca", "Souza", "05/05/1994","bianca@gmail.com","******"));
        repo.save(new Usuario("Carlos", "Limeira", "14/09/1973","carlos@gmail.com","******"));
        repo.save(new Usuario("Diana", "Vasques", "28/04/1996","diana@gmail.com","******"));
        repo.save(new Usuario("Esmeralda", "Fragueiro", "10/08/1962","esmeralda@gmail.com","******"));
        repo.save(new Usuario("Gertrudes", "Barcellos", "04/01/1957","gertrudes@gmail.com","******"));
        repo.save(new Usuario("Jose Antonio", "Prado", "12/11/1968","ana@gmail.com","******"));
    }

    public List<Usuario> getAll() {
        return repo.findAll();
    }
}
