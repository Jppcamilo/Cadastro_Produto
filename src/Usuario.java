public class Usuario {
    private final String username;
    private final String senha;

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