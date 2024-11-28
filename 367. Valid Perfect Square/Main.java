public class Main {
    public static void main(String args[]) {
        System.out.print(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        int min = 1;
        int max = num;
        int mid;
        while (min <= max) {
            mid = min + (max - min) / 2;
            System.out.println(mid);
            if (mid*mid == num) {
                return true;
            }
            else if (mid*mid < num) {
                min = mid+1;
            }
            else if (mid*mid > num) {
                max = mid-1;
            }
        }
        return false;
    }
}