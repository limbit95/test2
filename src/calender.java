import java.util.Calendar;

public class calender {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(2022, 8, 1);
        int cnt = 0;
        int MONTH2 = cal.get(Calendar.MONTH);

        String[][] myCalender = new String[7][6];
//                {{"일"},
//                        {"월"},
//                        {"화"},
//                        {"수"},
//                        {"목"},
//                        {"금"},
//                        {"토"}};

        System.out.print(cal.get(Calendar.MONTH) + 1 + "월 ");
        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "일");

        // 해당월 몇일 인지 세는 계산문
        while (MONTH2 == cal.get(Calendar.MONTH)) {
            if (cal.get(Calendar.DAY_OF_WEEK) == 1){
                myCalender[0][cal.get(Calendar.WEEK_OF_MONTH) - 1] = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
            } else if (cal.get(Calendar.DAY_OF_WEEK) == 2){
                myCalender[1][cal.get(Calendar.WEEK_OF_MONTH) - 1] = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
            } else if (cal.get(Calendar.DAY_OF_WEEK) == 3){
                myCalender[2][cal.get(Calendar.WEEK_OF_MONTH) - 1] = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
            } else if (cal.get(Calendar.DAY_OF_WEEK) == 4){
                myCalender[3][cal.get(Calendar.WEEK_OF_MONTH) - 1] = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
            } else if (cal.get(Calendar.DAY_OF_WEEK) == 5){
                myCalender[4][cal.get(Calendar.WEEK_OF_MONTH) - 1] = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
            } else if (cal.get(Calendar.DAY_OF_WEEK) == 6){
                myCalender[5][cal.get(Calendar.WEEK_OF_MONTH) - 1] = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
            } else if (cal.get(Calendar.DAY_OF_WEEK) == 7){
                myCalender[6][cal.get(Calendar.WEEK_OF_MONTH) - 1] = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
            }
            cal.add(Calendar.DAY_OF_MONTH, 1);
            cnt += 1;
        }

        System.out.print(cal.get(Calendar.MONTH) + 1 + "월 ");
        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "일");
        System.out.println(cnt + "일");

        System.out.println("              " + cal.get(Calendar.MONTH) + "월");
        System.out.println("---------------------------------");
        System.out.println("일　　월　　화　　수　　목　　금　　토");

        for (int i = 0; i < myCalender[i].length; i++){
            for (int x = 0; x < myCalender.length; x++){
                if (myCalender[x][i] == null) {
                    System.out.print("     ");
                } else if (Integer.valueOf(myCalender[x][i]) < 10){
                    System.out.print(myCalender[x][i] + "    ");
                }
                else {
                    System.out.print(myCalender[x][i] + "   ");
                }
            }
            System.out.println();
        }

    }
}
