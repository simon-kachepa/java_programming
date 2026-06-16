public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Game of throns", "Richard Tichafa", 231);
        Book book2 = new Book("The seed of life", "James Charowa", 208);
        Book book3 = new Book("The gods must be crazy", "Yen Ju", 422);
        Book book4 = new Book("Higher for higher life", "Guan Pen", 312);

        Book[] books = {book1, book2, book3, book4};
        
        Library library = new Library("MUDZI RDC LIBRARY", 1990, books);

        library.displayInfo();
    }
}
