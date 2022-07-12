import org.jsoup.Connection;
import org.jsoup.Jsoup;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {

            Map<String, String> cookies = new HashMap<>();
            cookies.put("click_id", "9oqZ1WHTXjZiC0t");
            cookies.put("utm_source", "cityads");
            cookies.put("utm_medium", "cpa");
            cookies.put("utm_campaign", "GZqOnJ");
            cookies.put("view", "cells");
            cookies.put("rrpvid", "9368090989830");
            cookies.put("_ym_uid", "1657623537289136392");
            cookies.put("_ym_d", "1657623537");
            cookies.put("tmr_lvidTS", "1657623537046");
            cookies.put("_userGUID", "0:l5i29707:i0DkO~04ZlRwyyOR0OIATbb9JHkhM_C6");
            cookies.put("dSesn", "007fc544-5ac6-0176-c30e-e38bae4c7794");
            cookies.put("_dvs", "0:l5i29707:vNbL9St7C0~xxc1kUgyV2f2lrLwUVXln");
            cookies.put("_ym_visorc", "b");
            cookies.put("_ym_isad", "2");
            cookies.put("_fbp", "fb.1.1657623537174.1783607690");
            cookies.put("_ga_6C350KZVLV", "GS1.1.1657623537.1.0.1657623537.0");
            cookies.put("_ga", "GA1.2.1461876393.1657623537");
            cookies.put("_gid", "GA1.2.1580517754.1657623537");
            cookies.put("rcuid", "62b096abb7ea5200015c1644");
            cookies.put("mark", "ea19e8a3-498d-45db-9c6c-c7702d61004d");
            cookies.put("rrwpswu", "true");
            cookies.put("tmr_detect", "0%7C1657623539898");
            cookies.put("tmr_reqNum", "3");

            var loginPost = Jsoup.connect("https://apteka-ot-sklada.ru/api/auth/request")
                    .header("Accept", "application/json, text/plain, */*")
                    .header("Accept-Encoding", "gzip, deflate, br")
                    .header("Accept-Language", "ru-RU,ru;q=0.9")
                    .header("Connection", "keep-alive")
                    .header("Content-Length", "23")
                    .header("Content-Type", "application/json;charset=UTF-8")
                    .cookies(cookies) //Куки из MAPы выше
                    .referrer("https://apteka-ot-sklada.ru/?click_id=9oqZ1WHTXjZiC0t&utm_source=cityads&utm_medium=cpa&utm_campaign=GZqOnJ")
                    .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36 SberBrowser/2.0.0.0")
                    .data("phone", "79191002341") //Номер телефона
                    .method(Connection.Method.POST)
                    .ignoreContentType(true)
                    .ignoreHttpErrors(true)
                    .execute();

            System.out.println("loginPost \n" + loginPost.body());


        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }


    }
}
