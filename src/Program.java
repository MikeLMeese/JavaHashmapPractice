import java.util.HashMap;
import java.util.Map;

public class Program {

    // Prints all keys in the hashmap using the hashmap as a parameter
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String allKeys: hashmap.keySet()) {
            System.out.println(allKeys);
        }
    }

    // Prints the keys in the hashmap containing a specific string
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String specificKey: hashmap.keySet()) {
            if (specificKey.contains(text)) {
                System.out.println(specificKey);
            }
        }
    }

    // Prints the values in the given hashmap whose keys contain a specific string
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (Map.Entry<String, String> values: hashmap.entrySet()) {
            if (values.getKey().contains(text)) {
                System.out.println(values.getValue());
            }
        }
    }

    public static void main(String[] args) throws Exception {

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}