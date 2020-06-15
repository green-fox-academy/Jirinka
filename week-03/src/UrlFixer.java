public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String newUrl = url.replaceAll("bots", "odds");
        String newNewUrl = newUrl.substring(0,4) + ":" + newUrl.substring(5);
        System.out.println(newNewUrl);
    }
}
