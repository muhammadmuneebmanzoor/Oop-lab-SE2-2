class LibraryItem {
    protected String title;
    protected String author;
    protected int year;

    public LibraryItem(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

class Book extends LibraryItem {
    protected String ISBN;
    protected int pages;

    public Book(String t, String a, int y, String i, int p) {
        super(t, a, y);
        ISBN = i;
        pages = p;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("ISBN: " + ISBN);
        System.out.println("Pages: " + pages);
    }
}

class Magazine extends LibraryItem {
    int issue;
    String month;
    String editor;

    public Magazine(String t, String a, int y, int i, String m, String e) {
        super(t, a, y);
        issue = i;
        month = m;
        editor = e;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue: " + issue);
        System.out.println("Month: " + month);
        System.out.println("Editor: " + editor);
    }
}

class ReferenceBook extends Book {
    String field;
    boolean isLendable;

    public ReferenceBook(String t, String a, int y, String i, int p, String f, boolean l) {
        super(t, a, y, i, p);
        field = f;
        isLendable = l;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Field: " + field);
        System.out.println("Lendable: " + (isLendable ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String args[]) {
        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book("Book Title", "Author A", 2000, "ISBN123", 300);
        items[1] = new Magazine("Mag Title", "Author B", 2023, 5, "May", "Editor X");
        items[2] = new ReferenceBook("Ref Title", "Author C", 2015, "ISBN999", 500, "Math", false);

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item " + (i + 1) + ":");
            items[i].displayInfo();
            System.out.println("---------------------");
        }
    }
}
