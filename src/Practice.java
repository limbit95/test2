import java.util.Random;
import java.util.StringTokenizer;

public class Practice {
    public static void main(String[] args) {

        // 기존 순서대로의 알파벳 String형
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // 랜덤으로 나열한 알파벳 String형
        String newAlphabet = "";
        
        // 알파벳 중복 대입을 피하기 위한 임시 장소
        String temp = "";

        // 랜덤 난수
        Random r = new Random();

        // 
        for (int i = 0; i < 26; i++){
            // alphabet에서 랜덤으로 알파벳 하나를 가져와 newAlphabet에 저장
            newAlphabet += alphabet.charAt(r.nextInt(alphabet.length()));

            // 앞으로 newAlphabet에 같은 알파벳이 중복되어 들어가지 않도록 랜덤한 알파벳을
            // 뽑을 alphabet 자료에서 newAlphabet에 속한 알파벳을 제외시킨다
            StringTokenizer st = new StringTokenizer(alphabet, newAlphabet, false);

            // for문이 반복되면서 temp에 쌓일 이전 데이터 비우기
            temp = temp.replace(temp, "");

            // newAlphabet에 있는 알파벳은 제외한 나머지 알파벳들만 임시저장소인 temp에 저장
            while (st.hasMoreTokens()) {
                temp += st.nextToken();
            }

            // for문이 반복되면서 alphabet에 쌓일 이전 데이터 비우기
            alphabet = alphabet.replace(alphabet, "");
            
            // 임시 저장해놓았던 temp의 알파벳들을 다시 alphabet에 옮기기
            alphabet = temp;
        }

        // 랜덤 나열 알파벳
        System.out.println(newAlphabet);

        String collection = "aeiou";
        StringTokenizer st2 = new StringTokenizer(newAlphabet, collection);

        while (st2.hasMoreTokens()){
            System.out.print(st2.nextToken());
        }

    }
}