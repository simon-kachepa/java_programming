public class Library {
    private String name;
    private int year;
    Book[] books;

    public Library (String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }

    public void displayInfo(){
        int i = 1;
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Available Books: ");
        for (Book book : books){
            System.out.print(i++ + ". ");
            book.displayInfo();
        }
    }
}
