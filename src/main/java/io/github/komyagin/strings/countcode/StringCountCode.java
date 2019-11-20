package io.github.komyagin.strings.countcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCountCode {

    public int countCode(String str) {
        Pattern pattern = java.util.regex.Pattern.compile("co.e");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
