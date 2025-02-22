import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string = "Jack,John,Nick,John";
        uniqStr(string);

    }

    private static void uniqStr(String string) {
//        String[] words = string.split(",");
        Set<String> setStr=new LinkedHashSet<>(Arrays.asList(string.split(",")));
//        for (int i = 0; i < words.length; i++) {
//            setStr.add(words[i]);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (Object o : setStr) {
//            sb.append(o);
//            sb.append(",");
//        }
        //System.out.println(sb);
        System.out.println(String.join(",", setStr));
    }
}