package arrays;

import java.util.List;

public class MatchingRules {


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int searchIndex=0;

        if(ruleKey.equals("color")){
            searchIndex=1;
        }else if(ruleKey.equals("name")){
            searchIndex=2;
        }

        int count=0;
        for(List<String> list:items){
            if(list.get(searchIndex).equals(ruleValue)){
                count++;
            }
        }
      return count;
    }

    public static void main(String[] args) {

    }
}
