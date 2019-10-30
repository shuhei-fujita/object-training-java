import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Date now = new Date();  //1

        Calendar c = Calendar.getInstance();    //2
        c.setTime(now); //2

        int day = c.get(Calendar.DAY_OF_MONTH);
        
        day += 100; //4
        c.set(Calendar.DAY_OF_MONTH, day); // 4
        
        Date future = c.getTime();
        
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");    //5

        System.out.println(f.format(future));  //6
    }
}