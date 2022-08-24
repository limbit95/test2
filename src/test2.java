import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class test2 {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String newAlphabet = "a";

        StringTokenizer st = new StringTokenizer(alphabet, newAlphabet, false);

        alphabet = alphabet.replace(alphabet, "");
        alphabet += st.nextToken();

        System.out.println(alphabet);


    }
}