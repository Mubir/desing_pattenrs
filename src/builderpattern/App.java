package builderpattern;

public class App {
    public static void main(String[] args) {
        UrlBuilder.Builder url = new UrlBuilder.Builder();
        UrlBuilder builtUrl =  url.protocol("http://")
        .host("leetcode.com")
        .port("8080").build();
        
        System.out.println(builtUrl.protocol+builtUrl.host+":"+builtUrl.port);
    }
}
