package io.github.komyagin.strings.catdog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCatDog {

    public boolean catDog(String str) {
        Pattern patternCat = java.util.regex.Pattern.compile("cat");
        Matcher matcherCat = patternCat.matcher(str);
        Pattern patternDog = java.util.regex.Pattern.compile("dog");
        Matcher matcherDog = patternDog.matcher(str);
        int countCat = 0;
        int countDog = 0;
        while (matcherCat.find()) {
            countCat++;
        }
        while (matcherDog.find()) {
            countDog++;
        }
        return countCat == countDog;
    }
}
