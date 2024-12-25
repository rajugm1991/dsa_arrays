package arrays;

public class pangram {


    public static boolean checkIfPangram(String sentence) {



        int[] charArr=new int[123];
        for (int i=0;i<sentence.toCharArray().length;i++){
            charArr[(int)sentence.charAt(i)]=1;
        }

        for (int i=97;i<=122;i++){
            if(charArr[i]==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

       String tes="thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(tes));
    }
}
