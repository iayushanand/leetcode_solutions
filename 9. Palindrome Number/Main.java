public class Main {
    public static void main(String args[]) {
        boolean ans = isPalindrome(121);
        System.out.print(ans);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int digit;
        int og = x;
        int reversed = 0;
        while (x != 0) {
            digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
            System.out.println(reversed);
        }
        return (og == reversed);
    }
}