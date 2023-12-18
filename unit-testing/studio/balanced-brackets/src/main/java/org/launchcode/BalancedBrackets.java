package org.launchcode;
public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        boolean bracket = false;
        if (str.contains("[") && str.contains("]")) {
            if (str.indexOf("[") < str.indexOf("]")) {
                bracket = true;

            }
        }

     return bracket;
    }
    public static void main(String[] args) {
        System.out.println(hasBalancedBrackets(""));
    }
}