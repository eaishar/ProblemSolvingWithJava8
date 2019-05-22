package sample;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Two strings a and b are called anagrams if they contain all the same characters
 *  in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

 * If two inputs a and b are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
 * @author eaishar
 *
 */
public class Anagram {

    static boolean isAnagram(String a, String b) {
        Stream <Character> ch1=a.codePoints().mapToObj(c->(char)c);
        Stream <Character> ch2=b.codePoints().mapToObj(c->(char)c);
        Map<Character,Long> map1=ch1.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Character,Long> map2=ch2.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        return map1.equals(map2);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

