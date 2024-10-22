package day01_5;
/*
Q1: Write a program to get the firstname, lastname and year of birth as input and return
the generated password. Follow the below table for more understanding.
Sample Input-Jaynam SAnghvi 1991
Output-aynang91
 */
class StringUtil{
    public String generatePassword(String firstName,String lastName, String yob){
    firstName=firstName.toLowerCase();
    lastName=lastName.toLowerCase();
    String first=firstName.substring(1,4);
    String second=lastName.substring(1,4);
    String year=yob.substring(2,4);
    return first+second+year;
    }
}
public class StringUtilTest {
    public static void main(String[] args) {
        String firstName="Jaynam";
        String lastName="SAnghvi";
        String yob="1991";
        StringUtil str=new StringUtil();
        String generatedPassword=str.generatePassword("Jaynam","SAnghvi","1991");
        System.out.println("Generated Password: "+generatedPassword);

    }
}
