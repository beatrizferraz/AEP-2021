package AEP2021;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
    private String nome;
    private String sobrenome;
    private String dataDeNascimento;
    private String email;
    private String senha;

    // Pattern pattern = Pattern.compile("^.+@.+\\..+$");
    // Matcher matcher = pattern.matcher(email);

    public Usuario(String nome, String sobrenome, String dataDeNascimento, String email, String senha) {
        setNome(nome);
        setSobrenome(sobrenome);
        setDataDeNascimento(dataDeNascimento);
        setEmail(email);
        setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().length() < 2) {
            throw new RuntimeException("Nome deve ter ao menos 2 caracteres.");
        } 
    
        nome = nome.toUpperCase();
        char[] charArray = nome.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
           char ch = charArray[i];
           if (!(ch >= 'A' && ch <= 'Z')) {
              throw new RuntimeException("Nome não pode conter números");
           }
        } 
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        if(sobrenome == null || sobrenome.trim().length() < 2) {
            throw new RuntimeException("Sobrenome deve ter ao menos 2 caracteres.");
        }  
        
        sobrenome = sobrenome.toUpperCase();
        char[] charArray = sobrenome.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
           char ch = charArray[i];
           if (!(ch >= 'A' && ch <= 'Z')) {
              throw new RuntimeException("Sobrenome não pode conter números");
           }
        } 
        this.sobrenome = sobrenome;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        // LocalDate currentDate = LocalDate.now();
        // if ((dataDeNascimento != null) && (currentDate != null)) {
        //      //Period.between(dataDeNascimento, currentDate).getYears();

        //      if(Period.between(dataDeNascimento, currentDate).getYears() > 121) {
        //         throw new RuntimeException("Data de nascimento inválida.");
        //      }
        // }  
        
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        if(senha == null || senha.trim().length() < 6 || senha.trim().length() > 12) {
            throw new RuntimeException("Senha deve conter entre 6 e 12 caracteres");
        }       
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + " " + sobrenome + "\n"
                + "Nascimento: " + dataDeNascimento + "\n"
                + "E-mail: " + email;                          
    }
}
