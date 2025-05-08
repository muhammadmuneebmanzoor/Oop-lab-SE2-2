public class PasswordCheck {
    public static void main(String[] args) {
        System.console().printf("Enter password: ");
        String password = System.console().readLine();

        if (password.length() < 6) 
            System.out.println("Password must be at least 6 characters.");
        else if (!password.matches(".*[A-Z].*")) 
            System.out.println("Must contain at least one uppercase letter.");
        else if (!password.matches(".*[a-z].*")) 
            System.out.println("Must contain at least one lowercase letter.");
        else if (!password.matches(".*\\d.*")) 
            System.out.println("Must contain at least one digit.");
        else 
            System.out.println("Password is valid!");
    }
}
