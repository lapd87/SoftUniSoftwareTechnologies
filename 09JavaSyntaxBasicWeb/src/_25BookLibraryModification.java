/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 4.12.2017 г.
 * Time: 10:54 ч.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class _25BookLibraryModification {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        Library newLibrary = new Library("New",
                new ArrayList<>());

        for (int i = 0; i < n; i++) {
            String[] input = console.nextLine().split(" ");

            newLibrary.books.add(ReadBook(input));
        }

        String dateString = console.nextLine();

        Date date = null;
        try {
            date = new SimpleDateFormat("dd.MM.yyyy").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        PrintBooks(newLibrary, date);
    }

    private static void PrintBooks(Library newLibrary, Date date) {

        HashMap<String, Date> titleDate = new HashMap<>();

        for (Book b : newLibrary.books) {
            if (b.releaseDate.after(date)) {
                titleDate.put(b.title, b.releaseDate);
            }
        }

        Map<String, Date> sorted = sortHash(titleDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        for (Map.Entry<String, Date> entry : sorted.entrySet()) {
            String key = entry.getKey();
            Date value = entry.getValue();

            System.out.println(key + " -> " + dateFormat.format(value));
        }
    }

    private static Map<String, Date> sortHash(Map<String, Date> map) {
        List<Map.Entry<String, Date>> list = new ArrayList<>(map.entrySet());

        // Sort list by integer values then by string keys
        Collections.sort(list, (a, b) -> {
            int cmp1 = a.getValue().compareTo(b.getValue());
            if (cmp1 != 0)
                return cmp1;
            else
                return a.getKey().compareTo(b.getKey());
        });

        Map<String, Date> result = new LinkedHashMap<>();
        for (Map.Entry<String, Date> entry : list)
            result.put(entry.getKey(), entry.getValue());

        return result;
    }

    public static Book ReadBook(String[] input) {

        String title = input[0];
        String author = input[1];
        String publisher = input[2];
        Date releaseDate = null;
        try {
            releaseDate = new SimpleDateFormat("dd.MM.yyyy").parse(input[3]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String ISBN = input[4];
        double price = Double.parseDouble(input[5]);

        Book currentBook = new Book(title,
                author,
                publisher,
                releaseDate,
                ISBN,
                price);

        return currentBook;
    }


    public static class Library {
        public String name;
        public List<Book> books;

        public Library(String name, List<Book> books) {
            this.name = name;
            this.books = books;
        }
    }

    public static class Book {
        public String title;
        public String author;
        public String publisher;
        public Date releaseDate;
        public String ISBN;
        public Double price;

        public Book(String title,
                    String author,
                    String publisher,
                    Date releaseDate,
                    String ISBN,
                    Double price) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.releaseDate = releaseDate;
            this.ISBN = ISBN;
            this.price = price;
        }
    }
}