package AEP_PERS;

import javax.persistence.Entity;

@Entity
public class Usuario extends BaseEntity {
    private String nome;
    private String sobrenome;
    private String dataDeNascimento;
    private String email;
    private String senha;
    
    public Usuario() {
        super();
    }

    public Usuario(String nome, String sobrenome, String dataDeNascimento, String email, String senha) {
        this();
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

    public void validaStringSemNumeros(String str) {
        str = str.toUpperCase();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
           char ch = charArray[i];
           if (!(ch >= 'A' && ch <= 'Z')) {
              throw new RuntimeException("Nome e sobrenome não podem conter números.");
           }
        } 
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().length() < 2) {
            throw new RuntimeException("Nome deve ter ao menos 2 caracteres.");
        } 
        validaStringSemNumeros(nome);
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        if(sobrenome == null || sobrenome.trim().length() < 2) {
            throw new RuntimeException("Sobrenome deve ter ao menos 2 caracteres.");
        }         
        validaStringSemNumeros(sobrenome);
        this.sobrenome = sobrenome;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setEmail(String email) {    
        //Pattern pattern = Pattern.compile("^.+@.+\\..+$");
        //Matcher matcher = pattern.matcher(email);
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
