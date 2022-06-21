package DailyCoding;

public class NumberSearch {
    public static void main(String[] args) {
        String str = "YlQO uT9";
        double sum = 0;
        double cnt = 0;
        double div = 0;
        int result = 0;
        str = str.replaceAll("\\s+","");
        for(int i = 0; i < str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                int num = Character.getNumericValue(str.charAt(i));
                sum += num;
            }else if(!Character.isDigit(str.charAt(i))){
                cnt++;
            }
        }
        div = sum/cnt;
        result = (int)Math.round(div);
        System.out.println("str : "+ str);
        System.out.println("div : "+ div);
        System.out.println("len : "+ str.length());
        System.out.println("cnt : "+ cnt);
        System.out.println("sum : "+ sum);
        System.out.println(result);
    }
}
