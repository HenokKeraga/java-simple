package cvd;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class StringCollator implements Comparator<String> {
    private final Collator collator;

    public StringCollator() {
        collator = Collator.getInstance(Locale.ENGLISH);
        collator.setStrength(Collator.PRIMARY);
    }

    @Override
    public int compare(String s1, String s2) {
        return collator.compare(transform(s1), transform(s2));
    }

    private String transform(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        StringBuilder digits = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(c);
            } else if (Character.isUpperCase(c)) {
                sb.append(c);
            } else if (Character.isDigit(c)) {
                digits.append(c);
            }
        }
        sb.append(digits);
        return sb.toString();
    }
}
