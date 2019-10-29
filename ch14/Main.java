import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 日時をDate型で取得
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("今日は" + year + "年" + month + "月" + day + "日です");
    }
}