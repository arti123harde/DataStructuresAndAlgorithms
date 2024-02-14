package org.solutions.string;

public class GoalParser {

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }

    public static String interpret(String command) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        int length = command.length();
        while (count < length){
            if(command.substring(count).startsWith("G")){
                str.append("G");
                count += 1;
            }else if(command.substring(count).startsWith("()")){
                str.append("o");
                count += 2;
            }else if(command.substring(count).startsWith("(al)")){
                str.append("al");
                count += 4;
            }
        }
        return str.toString();
    }
}

