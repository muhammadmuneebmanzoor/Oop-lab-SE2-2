import java.util.ArrayList;
import java.util.Scanner;

class DiaryEntry {
    String text;
    boolean isSecure;
    String password;

    DiaryEntry(String text, boolean isSecure, String password) {
        this.text = text;
        this.isSecure = isSecure;
        this.password = password;
    }
}

public class PersonalDiary {
    public static void main(String[] args) {
        ArrayList<DiaryEntry> diary = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Entry");
            System.out.println("2. View Entries");
            System.out.println("3. Search Entries");
            System.out.println("4. Edit Entry");
            System.out.println("5. Delete Entry");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                System.out.print("Enter entry: ");
                String entry = sc.nextLine();
                System.out.print("Is this a secure note? (yes/no): ");
                String secureAns = sc.nextLine().toLowerCase();
                boolean isSecure = secureAns.equals("yes");
                String password = "";
                if (isSecure) {
                    System.out.print("Set a password for this note: ");
                    password = sc.nextLine();
                }
                diary.add(new DiaryEntry(entry, isSecure, password));
                System.out.println("Entry added!");
            }
            else if (choice == 2) {
                if (diary.isEmpty()) {
                    System.out.println("No entries yet.");
                } else {
                    for (int i = 0; i < diary.size(); i++) {
                        DiaryEntry e = diary.get(i);
                        System.out.print((i + 1) + ". ");
                        if (e.isSecure) {
                            System.out.println("[Secure Note] (password required to view)");
                        } else {
                            System.out.println(e.text);
                        }
                    }
                    System.out.print("To view a secure note, enter its number (or 0 to skip): ");
                    int n = Integer.parseInt(sc.nextLine());
                    if (n > 0 && n <= diary.size() && diary.get(n - 1).isSecure) {
                        System.out.print("Enter password: ");
                        String pass = sc.nextLine();
                        if (pass.equals(diary.get(n - 1).password)) {
                            System.out.println("Note: " + diary.get(n - 1).text);
                        } else {
                            System.out.println("Incorrect password!");
                        }
                    }
                }
            }
            else if (choice == 3) {
                System.out.print("Enter keyword to search: ");
                String search = sc.nextLine().toLowerCase();
                boolean found = false;
                for (int i = 0; i < diary.size(); i++) {
                    DiaryEntry e = diary.get(i);
                    if (!e.isSecure && e.text.toLowerCase().contains(search)) {
                        System.out.println((i + 1) + ". " + e.text);
                        found = true;
                    }
                }
                for (int i = 0; i < diary.size(); i++) {
                    DiaryEntry e = diary.get(i);
                    if (e.isSecure && e.text.toLowerCase().contains(search)) {
                        System.out.print((i + 1) + ". [Secure Note] (password required to view)\n");
                        found = true;
                    }
                }
                if (!found) System.out.println("No matching entries found.");
            }
            else if (choice == 4) {
                System.out.print("Enter entry number to edit: ");
                int n = Integer.parseInt(sc.nextLine());
                if (n >= 1 && n <= diary.size()) {
                    DiaryEntry entry = diary.get(n - 1);
                    if (entry.isSecure) {
                        System.out.print("Enter password: ");
                        String pass = sc.nextLine();
                        if (!pass.equals(entry.password)) {
                            System.out.println("Incorrect password!");
                            continue;
                        }
                    }
                    System.out.print("Enter new text: ");
                    entry.text = sc.nextLine();
                    System.out.println("Entry updated!");
                } else {
                    System.out.println("Invalid entry number.");
                }
            }
            else if (choice == 5) {
                System.out.print("Enter entry number to delete: ");
                int n = Integer.parseInt(sc.nextLine());
                if (n >= 1 && n <= diary.size()) {
                    DiaryEntry entry = diary.get(n - 1);
                    if (entry.isSecure) {
                        System.out.print("Enter password: ");
                        String pass = sc.nextLine();
                        if (!pass.equals(entry.password)) {
                            System.out.println("Incorrect password!");
                            continue;
                        }
                    }
                    diary.remove(n - 1);
                    System.out.println("Entry deleted!");
                } else {
                    System.out.println("Invalid entry number.");
                }
            }
            else if (choice == 6) {
                System.out.println("Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}