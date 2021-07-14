package algo;

public class L28_implement_str {
    public static int strStr(String haystack, String needle) {


        if(needle.equalsIgnoreCase("") || haystack.equalsIgnoreCase(needle)) {
            return 0;
        }

        for(int i=0; i<haystack.length()-needle.length(); i++){
            if (compare(haystack.substring(i, i+needle.length()),needle)){
                return i;
            }
        }
        return -1;
    }

    public static boolean compare(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        for(int j=0; j<str1.length();j++){
            if(str1.charAt(j) != str2.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
