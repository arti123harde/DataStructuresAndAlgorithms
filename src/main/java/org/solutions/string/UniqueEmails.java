package org.solutions.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmails {

    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
        System.out.println(numUniqueEmails(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"}));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email : emails){
            String[] splits = email.split("@");
            String localName = splits[0];
            String domainName = splits[1];
            String split1 = localName.split("\\+")[0];
            set.add(String.join("", split1.split("\\.")) + "@" + domainName);
        }
        return set.size();
    }
}
