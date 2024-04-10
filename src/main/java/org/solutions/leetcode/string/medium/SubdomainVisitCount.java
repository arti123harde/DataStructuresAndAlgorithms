package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class SubdomainVisitCount {

    public static void main(String[] args) {
        System.out.println(subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com",
                "1 intel.mail.com", "5 wiki.org"}));
        System.out.println(subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> countDomainMap = new HashMap<>();
        for (String s : cpdomains){
            String[] splits = s.split(" ");
            String s1 = splits[1];
            while(s1.length() > 0){
                countDomainMap.put(s1, Integer.parseInt(splits[0]) + countDomainMap.getOrDefault(s1, 0));
                if(s1.indexOf(".") > 0){
                    s1 = s1.substring(s1.indexOf(".") + 1);
                }else {
                    break;
                }
            }
        }
        for(Map.Entry<String, Integer> entrySet : countDomainMap.entrySet()){
            result.add(entrySet.getValue() + " " + entrySet.getKey());
        }
        return result;
    }
}