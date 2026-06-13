class Book {

    String title;
    String author;

    Book(String title, String author) {

        this.title = title;
        this.author = author;
    }

    void display() {

        System.out.println(title);
        System.out.println(author);
    }

    public static void main(String[] args) {

        Book b =
            new Book("Java", "James Gosling");

        b.display();
    }
}