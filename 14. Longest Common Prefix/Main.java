public class Main {
    public static void main(String[] args) {
        String test = longestCommonPrefix(new String[] {"addog","adracecar","addcar"});
        System.err.println(test);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())return "";
            }
        }
        return prefix;
    }
}
