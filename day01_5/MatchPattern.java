package day01_5;

class MatchPatternUtil{
    /*01
    Return the array of int, which holds the index number of matched pattern.
string is non-null string input: abaaaba output: 0 4
     */
    public int[] matchabSequence(String string){
      int count=0;

        for(int i=0;i<string.length()-1;i++){
            if(string.charAt(i)=='a' && string.charAt(i+1)=='b'){
                count++;
            }
        }
        int arr[]=new int[count];
        int index=0;
       // System.out.println(count);
        for(int i=0;i<string.length()-1;i++){
            if(string.charAt(i)=='a' && string.charAt(i+1)=='b'){
                arr[index]=i;
                index++;
            }
        }
        return arr;
    }
    /*02
    Return the array of int, which holds the index number of matched pattern.
string is non-null string input: a12c3e456f output: 1 2 4 6 7 8
     */
    public  int[] findDigitLocation(String string){
        int count=0;

        for(int i=0;i<string.length()-1;i++) {
            if (Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        int arr[]=new int[count];
        int index=0;
        for(int i=0;i<string.length();i++){
            if(Character.isDigit(string.charAt(i))){
                arr[index]=i;
                index++;
            }
        }
        return arr;
    }
    /*
    Return the array of int, which holds the index number of matched pattern.
string is non-null string
input: a 1 56 _Z
output: 1 3 6
     */
    public int[]findWhiteSpaces(String string){
        int count=0;
        for(int i=0;i<string.length()-1;i++) {
            if (string.charAt(i)==' ') {
                count++;
            }
        }
        int arr[]=new int[count];
        int index=0;
        for(int i=0;i<string.length()-1;i++) {
            if (string.charAt(i)==' ') {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }
    /*
    Return the array of int, which holds the index number of matched pattern.
string is non-null string input: 12 0x 0x120Xf 0Xg output: 6 11
What to do : Find a set of characters in which the first character is a “0”,
 the second character is either an “x” of an “X”, and the third character is either
  a digit from “0” to “9”, a letter from “a” to “f” or an upper case letter “A” to “F.”
     */
    public  int[]findPattern(String string){
        int count=0;
        for(int i=0;i<string.length()-1;i++) {
            if (string.charAt(i)=='0' && (string.charAt(i+1)=='x' ||string.charAt(i+1)=='X') &&
                    (Character.isDigit(string.charAt(i+2)) ||
                            Character.toString(string.charAt(i+2)).matches("[a-fA-f]") )) {
                count++;
            }
        }
        int arr[]=new int[count];
        int index=0;
        for(int i=0;i<string.length();i++){
            if (string.charAt(i)=='0' && (string.charAt(i+1)=='x' ||string.charAt(i+1)=='X') &&
                    (Character.isDigit(string.charAt(i+2)) ||
                            Character.toString(string.charAt(i+2)).matches("[a-fA-f]") )) {
                arr[index]=i;
                index++;
            }
        }

        return arr;
    }
}
public class MatchPattern {
    public static void main(String[] args) {

        String str1="abaaaba";
        MatchPatternUtil mp=new MatchPatternUtil();
      int []result1= mp.matchabSequence(str1);
        System.out.print("Match ab sequence: ");
      for(int i=0;i<result1.length;i++) {
          System.out.print(result1[i]+" ");
      }

        System.out.println();

        String str2="a12c3e456f";
        int result2[]=mp.findDigitLocation(str2);
        System.out.print("find digit location: ");
        for(int i=0;i<result2.length;i++){
            System.out.print(result2[i]+" ");
        }

        System.out.println();

        String str3="a 1 56 _Z";
        int result3[]=mp.findWhiteSpaces(str3);
        System.out.print("find white space location: ");
        for(int i=0;i<result3.length;i++){
            System.out.print(result3[i]+" ");
        }

        System.out.println();

        String str4="12 0x 0x120Xf 0Xg";
        int result4[]=mp.findPattern(str4);
        System.out.print("find pattern: ");
        for(int i=0;i<result4.length;i++){
            System.out.print(result4[i]+" ");
        }
    }
}
