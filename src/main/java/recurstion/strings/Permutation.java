package recurstion.strings;

public class Permutation {


    static void perm(String p,String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c=up.charAt(0);

        for(int i=0; i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            perm(f+c+s,up.substring(1));
        }
    }

    public static void main(String[] args) {
        perm("","abcdef");
    }
}
