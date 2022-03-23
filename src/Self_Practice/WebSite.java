package Self_Practice;

public class WebSite {
/*
Given some urls determine how many .com, .org, and .edu websites
there are. Also keep track of an ‘other’ category for websites that have
a different domain
 */
    public static void main(String[] args) {

        String [] websites = {"bing.com" , "wikimedia.org" , "twitter.com", "amazonaws.com" , "japanpost.jp", "mysql.com","nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com","comcast.net", "tamu.edu", "utexas.edu" };
        int com = 0;
        int org = 0;
        int edu = 0;
        int others = 0;

        for(String elements:websites){
            if(elements.endsWith(".com")){
                com++;
            }else if(elements.endsWith(".org")){
                org++;
            }else if(elements.endsWith(".edu")){
                edu++;
            }else{
                others++;
            }

        }

        System.out.println("Ends in .com - " + com);
        System.out.println("Ends in .org - " + org);
        System.out.println("Ends in .edu - " + edu);
        System.out.println("Ends in something else - " + others);

    }
}
