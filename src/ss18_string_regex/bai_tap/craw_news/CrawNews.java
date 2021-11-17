package ss18_string_regex.bai_tap.craw_news;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://viettuts.vn/java-collection/su-khac-nhau-giua-comparable-va-comparator");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\n+","");
            Pattern p = Pattern.compile("title\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()){
                System.out.println(m.group(1));
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
}
