package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearnPatternAndMatcher {
    public static void main(String[] args) {
        String text = "mndsfbn dskjfbgreuih fhgjhuidfh oidfshghdf jdfshgjidh  fknjkidhf hdfjsbvbhjbhghsyi  kjbnhjbhjtrh" +
                "svdfjhjh sdsj hkjs sasha@mail.ru dsnbkh dsbdh dnsdkjhrue h alesia@gmail.com";
        Pattern email = Pattern.compile("\\w+@(mail|gmail)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
