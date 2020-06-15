public class SimpleReplace {
    public static void main(String[] args) {

        String sentence = "In a dishwasher far far away";
        String newSentence = sentence.replaceAll("dishwasher", "galaxy" );
        System.out.println(newSentence);
    }
}
