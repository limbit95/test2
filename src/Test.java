import java.util.Random;
import java.util.StringTokenizer;

public class Test {

    public static void main(String[] args) {

        // 알파벳 String형 (오리지널 데이터)
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        // 알파벳 String 배열 (변환 데이터)
        String[] strAlphabet = new String[alphabet.length()];

        // String에서 String[]로 변환시키는 for문
        for (int i = 0; i < alphabet.length(); i++){
            strAlphabet[i] = String.valueOf(alphabet.charAt(i));
        }

// 알파벳 랜덤 나열을 위한 랜덤 인덱스 번호 배열
        int[] a = new int[alphabet.length()-1];
        Random r = new Random();
        for (int i = 0; i < alphabet.length()-1; i++){
            a[i] = r.nextInt(25)+1;
            for (int j = 0; j < i; j++){
                if (a[i] == a[j]){
                    i--;
                }
            }
        }

//      중복 거르기 위한 새로운 알파벳 String
        String newAlphabet = "";

        for (int i = 0; i < alphabet.length() - 1; i++){
            newAlphabet += strAlphabet[a[i]];
        }

        System.out.println(newAlphabet);

        // 모음 토크나이저
        StringTokenizer st = new StringTokenizer(newAlphabet, "aeiou", false);

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken());
        }
    }
}
