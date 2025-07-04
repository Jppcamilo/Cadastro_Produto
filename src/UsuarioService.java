import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioService {
    private final ArrayList<Usuario> usuarios = new ArrayList<>();
    private final Scanner leitordeDados;

    public UsuarioService(Scanner leitordeDados) {
        this.leitordeDados = leitordeDados;
    }

    public void cadastrarUsuario() {
        String username;
        while (true) {
            System.out.println("Digite o nome de usuário:");
            username = leitordeDados.nextLine();
            boolean nomeExistente = false;
            for (Usuario usuario : usuarios) {
                if (usuario.getUsername().equalsIgnoreCase(username)) {
                    System.out.println("❌ Nome de usuário já cadastrado. Tente novamente.");
                    nomeExistente = true;
                    break;
                }
            }
            if (!nomeExistente) {
                break;
            }
        }

        System.out.println("Digite a senha:");
        String senha = leitordeDados.nextLine();

        usuarios.add(new Usuario(username, senha));
        System.out.println("✅ Usuário cadastrado com sucesso!");
    }

    public boolean autenticarUsuario() {
        System.out.println("Digite o nome de usuário:");
        String username = leitordeDados.nextLine();
        System.out.println("Digite a senha:");
        String senha = leitordeDados.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.autenticar(username, senha)) {
                return true; // Autenticação bem-sucedida
            }
        }
        return false; // Falha na autenticação
    }

}