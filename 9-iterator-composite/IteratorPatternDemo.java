public class IteratorPatternDemo {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection(5);
        bookCollection.addBook(new Book("Design Patterns"));
        bookCollection.addBook(new Book("Clean Code"));
        bookCollection.addBook(new Book("Refactoring"));

        Iterator iterator = bookCollection.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Book: " + book.getTitle());
        }
    }
}
