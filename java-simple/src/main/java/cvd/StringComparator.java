package cvd;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        boolean s1HasLetter = false;
        boolean s2HasLetter = false;
        for (char c : s1.toCharArray()) {
            if (Character.isLetter(c)) {
                s1HasLetter = true;
                break;
            }
        }
        for (char c : s2.toCharArray()) {
            if (Character.isLetter(c)) {
                s2HasLetter = true;
                break;
            }
        }
        if (s1HasLetter && !s2HasLetter) {
            return -1;
        } else if (!s1HasLetter && s2HasLetter) {
            return 1;
        } else {
            return s1.compareTo(s2);
        }
    }
}