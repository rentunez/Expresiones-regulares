import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part3 {
    public static void main(String[] args) {

        Pattern pat = Pattern.compile( "Go"+ "Pearl" + "Python" + "Java" + "Pascal", Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher("Java y Python");

        boolean matchFound = mat.find();

        if (matchFound) {
            System.out.println("Match found: " + mat);
        } else {
            System.out.println("Match not found");
        }
    }
}
