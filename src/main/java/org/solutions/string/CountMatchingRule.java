package org.solutions.string;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CountMatchingRule {

    public static void main(String[] args) {
        System.out.println(countMatches(Arrays.asList(Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"), Arrays.asList("phone","gold","iphone")), "color", "silver"));
        System.out.println(countMatches(Arrays.asList(Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","phone"), Arrays.asList("phone","gold","iphone")), "type", "phone"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> item : items){
            if(Objects.equals(ruleKey, "type")){
                count += (Objects.equals(item.get(0), ruleValue) ? 1 : 0);
            } else if(Objects.equals(ruleKey, "color")){
                count += (Objects.equals(item.get(1), ruleValue) ? 1 : 0);
            } else if(Objects.equals(ruleKey, "name")){
                count += (Objects.equals(item.get(2), ruleValue) ? 1 : 0);
            }
        }
        return count;
    }
}
