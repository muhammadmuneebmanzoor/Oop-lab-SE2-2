public class RemoveChars {
    public static void main(String[] args) {
        String str = "abrambabasc";
        System.out.println("The given string is: " + str);

        String newStr = str.replace("ac", "").replace("b", "");

        System.out.println("After removing, the new string is: " + newStr);
    }
}
