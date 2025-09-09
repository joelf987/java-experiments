package org.jf.tosh.cmd;

import java.util.function.Function;

class StringReverser implements Function<String, String> {

    @Override
    public String apply(String s) {
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }
//            return     IntStream.iterate(s.length()-1, i -> i>=0, i -> i - 1)
//                        .mapToObj(i -> s.charAt(i)).map(Objects::toString).
//                        collect(() -> new StringBuilder(), StringBuilder::append, (sb1, sb2) -> sb1.append(sb2.toString()))
//                        .toString();
        return reverse.toString();
    }
}
