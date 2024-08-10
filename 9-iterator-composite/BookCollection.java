public class BookCollection implements Aggregate {
    private Book[] books;
    private int index = 0;

    public BookCollection(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (index < books.length) {
            books[index] = book;
            index++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
