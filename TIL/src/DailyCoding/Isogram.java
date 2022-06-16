package DailyCoding;

public class Isogram {
    public static void main(String[] args) {
        String str = "uncopyrightable";
        for(int i=0; i < str.length()-1 ; i++){
            for(int j=i+1; j < str.length() ; j++){
                if(Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(str.charAt(j))){

                    System.out.println(false);
                }
            }
        }
        System.out.println(true);
    }
}
