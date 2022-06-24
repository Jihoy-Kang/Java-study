package Collection;

public class CompressString {
    public static void main(String[] args) {
        String str = "EQTWVOQQQVDVRC";
        int cnt = 1;
        String result = "";

        //빈문자열을 입력할경우 빈 문자열 리턴
        //3개이상 연속되는 문자만 압축

        //문자열을 입력받아 n과 n-1을비교한다
        //2번 연속으로  문자열이 같을경우 연속된 숫자+1과 해당 문자 리턴
        if(str.length() == 0) System.out.println("");

        for(int i = 0; i <str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }else{
                if(cnt >= 3){
                    result += cnt + String.valueOf(str.charAt(i));
                }else if(cnt == 2){
                    result += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));
                }else{
                    result += String.valueOf(str.charAt(i));
                }
                cnt = 1;
            }
            if(i == str.length()-2){
                if(cnt >= 3){
                    result += cnt + String.valueOf(str.charAt(i));
                }else if(cnt == 2){
                    result += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));
                }else{
                    result += String.valueOf(str.charAt(i+1));
                }
            }
        }
        System.out.println(result);
    }
}
