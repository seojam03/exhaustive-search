public class Main {
 
    public static void main(String[] args) {
 
        int birthday_month = 9; // 정답 월
        int birthday_date = 21; // 정답 일
 
        for (int month = 1; month <= 12; month++) {
 
            for (int date = 1; date <= 31; date++) {
 
                if (month == birthday_month && date == birthday_date){
                    System.out.println("Your Birthday is " + month + "/" + date + " !!");
                }
 
            }
        }
    }
}