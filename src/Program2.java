import java.util.HashMap;

public class Program2 {

    // Prints all values in the hashmap using the toString method of Book objects
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book books: hashmap.values()) {
            System.out.println(books);
        }
    }

    // Prints only the books in a given hashmap whose name contains the given string.
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book books: hashmap.values()) {
            if (books.getName().contains(text)) {
                System.out.println(books);
            }
        }
    }

    public static void main(String[] args) throws Exception {

        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
}