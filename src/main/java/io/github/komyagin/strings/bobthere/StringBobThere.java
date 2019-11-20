package io.github.komyagin.strings.bobthere;

public class StringBobThere {
    public boolean bobThere(String str) {
        return str.matches("(\\w+)?b.b(\\w+)?");
    }
}
