package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Arti Harde
 */
public class LexicographicallySmallestEquivalentString {

    public static void main(String[] args) {
        System.out.println(smallestEquivalentString("gmerjboftfnqseogigpdnlocmmhskigdtednfnjtlcrdpcjkbj",
                "fnnafafhqkitbcdlkpiloiienikjiikdfcafisejgeldprcmhd",
                "ezrqfyguivmybqcsvibuvtajdvamcdjpmgcbvieegpyzdcypcx"));
        System.out.println(smallestEquivalentString("parker", "morris", "parser"));
        System.out.println(smallestEquivalentString("hello", "world", "hold"));
        System.out.println(smallestEquivalentString("leetcode", "programs", "sourcecode"));
    }

    public static String smallestEquivalentString(String s1, String s2, String baseStr) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Set<Character>> list1 = new ArrayList<>();
        for(int i=0; i<s1.length(); i++){
            boolean present = false;
            List<Set<Character>> tempList = new ArrayList<>();
            Set<Character> characterSet = new HashSet<>();
            for(Set<Character> set : list1){
                if(set.contains(s1.charAt(i)) || set.contains(s2.charAt(i))){
                    set.add(s1.charAt(i));
                    set.add(s2.charAt(i));
                    present = true;
                }
                if(set.contains(s1.charAt(i))){
                    characterSet.add(s2.charAt(i));
                    characterSet.addAll(set);
                    present = true;
                }else if(set.contains(s2.charAt(i))){
                    characterSet.add(s1.charAt(i));
                    characterSet.addAll(set);
                    present = true;
                }else{
                    tempList.add(set);
                }
            }
            if(!present){
                Set<Character> set = new HashSet<>();
                set.add(s1.charAt(i));
                set.add(s2.charAt(i));
                list1.add(set);
            }else{
                list1 = tempList;
                list1.add(characterSet);
            }
        }
        List<List<Character>> list2 = new ArrayList<>();
        for (Set<Character> characters : list1) {
            LinkedHashSet<Character> set = characters.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
            list2.add(new ArrayList<>(set));
        }
        for(char c : baseStr.toCharArray()){
            Optional<List<Character>> characterSet = list2.stream().filter(list -> list.contains(c)).findFirst();
            if(characterSet.isPresent()){
                stringBuilder.append(characterSet.get().get(0));
            }else{
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}