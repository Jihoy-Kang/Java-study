package DailyCoding;

public class balancedBrackets {
    public static void main(String[] args) {
        String str = "[(]{)}";
        Character[] brackets = new Character[]{'(','{','[',')','}',']'};

        for(int j = 0; j < 3;j++){
            int cntA = 0;
            int cntB = 0;

            for(int i = 0; i < str.length();i++){
                if(cntA < cntB){
                    System.out.println(false);
                    break;
                }
                if(str.charAt(i)==brackets[j]){
                    cntA++;
                }else if(str.charAt(i)==brackets[j+3]){
                    cntB++;
                }
            }
            if(cntA !=cntB){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
/*
public class Solution {
    public boolean balancedBrackets(String str) {

        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> opener = new HashMap<>();
        opener.put('{', '}');
        opener.put('[', ']');
        opener.put('(', ')');


        String closer = "}])";


        for(int i = 0; i < str.length(); i++) {

            if(opener.containsKey(str.charAt(i)))
                stack.push(str.charAt(i));

            } else if(closer.indexOf(str.charAt(i)) != -1 && stack.size() > 0) {

                char top = stack.pop();
                char pair = opener.get(top);

                if(pair != str.charAt(i)) {
                    return false;
                }

            } else {
                return false;
            }
        }

        return stack.size() == 0;
    }
}*/
