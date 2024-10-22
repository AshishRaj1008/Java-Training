package day01_5;
/*
Sample Input-www.sample.com/admin/createProject.html
Output-createProject
 */
class StringUtil2{
    /*
    first we have to split the user input through split method.
   */


    public String getCommand(String url) {

        String[] urlparts = url.split("/");
        String lastPart = urlparts[urlparts.length - 1];
        String result = lastPart.substring(0, lastPart.length() - 5);
        return result;
    }
}

/**
 *
 */
public class StringUtilTest2 {
    public static void main(String[] args) {
        String url="www.sample.com/admin/createProject.html";
        StringUtil2 str=new StringUtil2();
        String output=str.getCommand(url);
        System.out.println("Output: "+output);
    }
}
