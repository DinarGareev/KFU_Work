package strings;

public class RegularExcprection {
    public static void main(String[] args) {
        String string1 = "Hello! my !beautiful friend";
        String words[] = string1.split("\\s*(\\s|!|\\.)\\s* ");
        // \\s -
        for (String word:words){
            System.out.println(word);
        }
    }
}
