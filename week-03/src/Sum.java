public class Sum {
    public static void main(String[] args) {
        int count = 10;
        summarize(count);
        System.out.println(summarize(count));
    }

    public static int summarize (int lastNumber) {
        int number = 0;
            for (int i = 1; i <= lastNumber; i++) {
            number = number + i;
            }
            return number;
    }
}