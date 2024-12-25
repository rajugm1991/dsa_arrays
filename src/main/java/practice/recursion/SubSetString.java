package practice.recursion;

public class SubSetString {


    static void sub(String p,String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);
        sub(p+c,up.substring(1));
        sub(p,up.substring(1));
    }

    public static void main(String[] args) {
        sub("","abc");
    }
}
