package pl.javastart.library.model;

public class Library {

    private final static int MAX_BOOK= 1000;
    private Book[] books = new Book[MAX_BOOK];
    private int booksNumber;

    public void addBook(Book book) {
        if(booksNumber < MAX_BOOK) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maksymalna liczba książek została osiągnięta");
        }

    }

    public void printBooks() {
        if(booksNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        }
        for(int i=0; i<booksNumber; i++) {
            books[i].printInfo();
        }
    }
}