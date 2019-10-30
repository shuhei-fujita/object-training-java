import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Date now = new Date(); // まずDateクラスを使って，Date型の現在時刻を取り出す

        SimpleDateFormat f = new SimpleDateFormat(); // Date型からString型を生成
        String s = f.format(now);
        System.out.println(s);

        Date d = f.parse("2011/09/22 01:23:45");
        System.out.println(d);
    }
}