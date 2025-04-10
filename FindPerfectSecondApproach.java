public class FindPerfectSecondApproach {

    public static boolean findPerfectSecondApproach(int n) {
        int beg = 1, end = n;

        while (beg <= end) {
            int mid = beg + (end - beg) / 2; // Prevents overflow
            long square = (long) mid * mid;

            if (square == n) {
                return true;
            } else if (square < n) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 25;
        boolean ans = findPerfectSecondApproach(number);
        System.out.println("Is " + number + " a perfect square? " + ans);
    }
}
