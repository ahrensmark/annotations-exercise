import java.util.ArrayList;
import java.util.List;
public class Author extends Person {
    private List books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use addBook instead
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public List<String> getBooks() {
        return books;
    }

    @SuppressWarnings("unchecked")
    public List<String> publishedBooks() {
        return books;
    }

    @SuppressWarnings("unchecked")
    public void addBook(String book) {
        books.add(book);
    }

    @Override
    //public String sortName() {
        public String fullName () {
            return String.format("%s, %s", lastName, firstName);
        }
    }


//import java.util.ArrayList;
//import java.util.List;
//
//public class Author extends Person {
//    @SuppressWarnings("rawtypes")
//    private List books;
//
//    public Author(String firstName, String lastName) {
//        super(firstName, lastName);
//        books = new ArrayList();
//    }
//
//    /**
//     * @deprecated Use publishedBooks instead
//     */
//
//
//    @SuppressWarnings("deprecation")
//    public List<String> getBooks() {
//        return books;
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<String> publishedBooks() {
//        return books;
//    }
//
//    @SuppressWarnings("unchecked")
//    public void addBook(String book) {
//        books.add(book);
//    }
//
//    @Override
//    public String fullName()
//    {
//        return String.format("%s, %s", lastName, firstName);
//    }
//}
