class CounttheHiddenSequences2145{
    public static void main(String[] args) {
        int[] differences = {3,-4,5,1,-2};
        int lower = -4;
        int upper = 5;
        System.out.println(numberOfArrays(differences, lower, upper));
    }
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        long sum = 0, maxi = 0, mini = 0;
        for (int x : differences) {
            sum += x;
            maxi = Math.max(maxi, sum);
            mini = Math.min(mini, sum);
        }
        return (int)Math.max(0, upper - lower - maxi + mini + 1);
    }
}