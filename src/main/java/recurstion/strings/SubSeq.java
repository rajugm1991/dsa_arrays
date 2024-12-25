package recurstion.strings;

public class SubSeq {


    static void seq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);
        seq(p+c,up.substring(1));
        seq(p,up.substring(1));
    }


    public static void main(String[] args) {
        seq("","abc");
    }
}
