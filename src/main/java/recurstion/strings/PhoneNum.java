package recurstion.strings;

public class PhoneNum {


    static void phone(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=Integer.parseInt(String.valueOf(up.charAt(0)));
        int dig=(digit-1)*3;
        for (int i=dig;i<(digit*3);i++){
            if(i==26){
                return;
            }
            char d= (char) ('a'+i);
            phone(p+String.valueOf(d),up.substring(1));
        }
    }

    public static void main(String[] args) {
        phone("","89");
    }
}
