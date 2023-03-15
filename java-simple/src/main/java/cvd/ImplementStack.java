package cvd;

import java.text.Collator;
import java.util.*;

public class ImplementStack {
    public static void main(String[] args) {

        var list = new ArrayList<>(List.of("11","aa", "AA","12a"));

//        var comparator = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                int index1 = findIndex(s1);
//                int index2 = findIndex(s2);
//                if (index1 != -1 && index2 != -1) {
//                    if (index1 != index2) {
//                        return Integer.compare(index1, index2);
//                    }
//                } else if (index1 == -1 && index2 == -1) {
//                    return s1.compareTo(s2);
//                } else if (index1 == -1) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//                return s1.compareTo(s2);
//            }
//            private int findIndex(String s) {
//                for (int i = 0; i < s.length(); i++) {
//                    char c = s.charAt(i);
//                    if (Character.isUpperCase(c) && i + 1 < s.length()) {
//                        char nextChar = s.charAt(i + 1);
//                        if (Character.isLowerCase(nextChar)) {
//                            return i + 1;
//                        } else if (Character.isDigit(nextChar)) {
//                            return i + 1;
//                        }
//                    }
//                }
//                return -1;
//            }
//
//        };


        Collator collator = Collator.getInstance(Locale.getDefault());
        list.sort((l1,l2)->collator.compare(l1,l2));
       // list.sort((l1,l2)->-1*l1.compareTo(l2));

        System.out.println(list);


        
    }
}
