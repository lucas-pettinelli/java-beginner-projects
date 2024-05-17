public class UserProfile {

    private String username;
    private String email;

    public UserProfile(String username, String email) throws InvalidEmailException {
        if (email == null || email.isEmpty()) {
            throw new InvalidEmailException("Erro: O email não pode ser nulo ou vazio");
        }
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {

        try {
            UserProfile user = new UserProfile("john_doe", null); // Isso lançará InvalidEmailException
            System.out.println("Perfil de usuário criado: " + user.getUsername() + ", " + user.getEmail());
        } catch (InvalidEmailException e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Execução finalizada.");
        }

        try {
            UserProfile user = new UserProfile("john_doe", "john@example.com"); // Email válido
            System.out.println("Perfil de usuário criado: " + user.getUsername() + ", " + user.getEmail());
        } catch (InvalidEmailException e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Execução finalizada.");
        }
    }
}
