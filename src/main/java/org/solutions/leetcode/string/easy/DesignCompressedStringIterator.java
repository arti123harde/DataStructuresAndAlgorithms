package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class DesignCompressedStringIterator {
    public String compressedString;

    public static void main(String[] args) {
        DesignCompressedStringIterator designCompressedStringIterator
                = new DesignCompressedStringIterator("x6");
        System.out.println(designCompressedStringIterator.next());
        System.out.println(designCompressedStringIterator.next());
        System.out.println(designCompressedStringIterator.next());
        System.out.println(designCompressedStringIterator.next());
        System.out.println(designCompressedStringIterator.next());
        System.out.println(designCompressedStringIterator.next());
        System.out.println(designCompressedStringIterator.hasNext());
        System.out.println(designCompressedStringIterator.next());
        System.out.println(designCompressedStringIterator.hasNext());
    }

    public DesignCompressedStringIterator(String compressedString) {
        this.compressedString = compressedString;
    }

    public char next() {
        if(compressedString.length() > 0){
            char c = compressedString.charAt(0);
            if(compressedString.length() > 1 && Character.isDigit(compressedString.charAt(1))){
                StringBuilder stringBuilder = new StringBuilder();
                int index = 1;
                while (index<compressedString.length() && Character.isDigit(compressedString.charAt(index))){
                    stringBuilder.append(compressedString.charAt(index));
                    index++;
                }
                int repeat = Integer.parseInt(stringBuilder.toString()) - 1;
                if (repeat != 0){
                    compressedString = c + String.valueOf(repeat) + compressedString.substring(index);
                }else if(index <= compressedString.length()){
                    compressedString = compressedString.substring(2);
                }
            }else{
                compressedString = compressedString.substring(1);
            }
            return c;
        }
        return ' ';
    }

    public boolean hasNext() {
        return compressedString.length() != 0;
    }
}