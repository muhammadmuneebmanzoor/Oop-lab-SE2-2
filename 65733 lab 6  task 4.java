public class EmployeeEmails {
    public static void main(String[] args) {
        StringBuffer employees = new StringBuffer();

        String[] names = {"John", "Alice", "Bob"};
        String[] emails = {"john@example.com", "alice@example.com", "bob@example.com"};

        for (int i = 0; i < 3; i++) {
            employees.append(names[i]).append(" - ").append(emails[i]).append("\n");
        }

        System.out.println("Employee Details:\n" + employees);
    }
}
