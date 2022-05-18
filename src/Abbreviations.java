import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviationMap = new HashMap<String, String>();

    public Abbreviations() {
    }

    // Adds new abbreviation and explanation
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationMap.put(abbreviation, explanation);
    }

    // Checks if an abbreviation has already been added
    public boolean hasAbbreviation(String abbreviation) {
        return abbreviationMap.get(abbreviation) != null;
    }

    // Finds the explanation for an abbreviation
    public String findExplanationFor(String abbreviation) {
        return abbreviationMap.get(abbreviation);
    }

    public static void main(String[] args) throws Exception {

        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}