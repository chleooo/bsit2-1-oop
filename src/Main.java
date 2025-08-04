class Main {
    String title;
    String author;
    int pages;
    boolean isAvailable;

    public Main(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        System.out.println("A new book" + title + " " + "by" + " " + author + " has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        if (isAvailable) {
            System.out.println("Available: Yes");
        } else {
            System.out.println("Available: No");
        }

    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book" + " " + title + " " + "has been borrowed.");
        } else {
            System.out.println("The book" + " " + title + " " + "is currently unavailable.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You have returned" + " " + title + ".");
    }

    public static void main(String[] args) {
        Main book1 = new Main("THE 48 LAWS OF POWER", "R. Greene", 143);
        Main book2 = new Main("Atomic Habits", "J. Clear", 431);
        Main book3 = new Main("The Book of Over Thinking", "G. Smith", 314);

        System.out.println();
        book1.displayInfo();
        book1.borrowBook();
        book1.displayInfo();
        book1.returnBook();
        book1.displayInfo();

        System.out.println();
        book2.displayInfo();
        book2.borrowBook();
        book2.displayInfo();
        book2.returnBook();
        book2.displayInfo();

        System.out.println();
        book3.displayInfo();
        book3.borrowBook();
        book3.displayInfo();
        book3.returnBook();
        book3.displayInfo();
    }
}
