package io.github.komyagin.strings.repeatfront;

public class StringRepeatFront {

    public String repeatFront(String str, int n) {
        int len = n;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str.substring(0, len));
            len--;
        }
        return sb.toString();
    }
}
