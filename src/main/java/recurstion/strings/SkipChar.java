package recurstion.strings;

public class SkipChar {


    public static final String skipApple(String word){

        if(word.isEmpty()){
            return "";
        }
        if(word.startsWith("apple")){
            return skipApple(word.substring(5));
        }
        return word.charAt(0)+skipApple(word.substring(1));
    }

    static String skipChar(String word){
        if(word.isEmpty()){
            return "";
        }
        char firstletter=word.charAt(0);
        if(firstletter=='a'){
            return skipChar(word.substring(1));
        }
        return firstletter+skipChar(word.substring(1));
    }

    public static void main(String[] args) {
        String s="aaaaa1aa";
        System.out.println(skipChar(s));

        System.out.println(skipApple("rfajapplea"));

    }



}
