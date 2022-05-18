public class Book {

    private String name;
    private int year;
    private String content;
    
    String a = System.lineSeparator();

    public Book (String name, int year, String content) {
        this.name = name;
        this.year = year;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " (" + this.year + ")" + a +
        "content: " + this.content;
    }
}