import java.util.ArrayList;

public class Usuario {
    private String username;
    private String senha;
    private static final ArrayList<Usuario> usuarios = new ArrayList<>();

    public Usuario(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public boolean autenticar(String username, String senha) {
        return this.username.equals(username) && this.senha.equals(senha);
    }

}