import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part1 {
    public static void main(String[] args) {

        Pattern pat = Pattern.compile("Hola mundo");
        Matcher mat = pat.matcher("rentunez Hola mundo");

        boolean matchFound = mat.find();

        if (matchFound) {
            System.out.println("Match found: " + mat);
        } else {
            System.out.println("Match not found");
        }
    }
}