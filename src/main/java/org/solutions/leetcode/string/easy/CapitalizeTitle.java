package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class CapitalizeTitle {

    public static void main(String[] args) {
        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
        System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
        System.out.println(capitalizeTitle("i lOve leetcode"));
    }

    public static String capitalizeTitle(String title) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] splits = title.split(" ");
        for(int i=0; i<splits.length; i++){
            if(splits[i].length() == 1 || splits[i].length() == 2){
                stringBuilder.append(splits[i].toLowerCase());
            }else {
                stringBuilder.append(String.valueOf(splits[i].charAt(0)).toUpperCase())
                        .append(splits[i].substring(1).toLowerCase());
            }
            if(i+1<splits.length){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}