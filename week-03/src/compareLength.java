public class compareLength {
    public static void main(String[] args) {

        int [] firstArrayOfNumbers =  {1, 2,3};
        int [] secondArrayOfNumbers = {4, 5};

        if (secondArrayOfNumbers.length > firstArrayOfNumbers.length){
            System.out.println("Second array is longer than first one");
        }
        else {
            System.out.println("First is longer.");

        }
    }
}
