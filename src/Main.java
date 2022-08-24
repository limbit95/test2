import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] stAlphabet = new String[alphabet.length()];
        String[] stAlphabet2 = new String[alphabet.length()];

        for (int i = 0; i < alphabet.length(); i++){
            stAlphabet[i] = String.valueOf(alphabet.charAt(i));
        }

        Random r = new Random();

        for (int i = 0; i < stAlphabet.length;){

            stAlphabet2[i] = stAlphabet[r.nextInt()];

            for (int x = 0; x < i; x++){
                if (stAlphabet2[x] == stAlphabet2[i]){

                }
            }
        }

    }
}

