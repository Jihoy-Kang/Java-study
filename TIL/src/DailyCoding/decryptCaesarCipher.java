package DailyCoding;

public class decryptCaesarCipher {
    public static void main(String[] args) {
        String str = "mnv xnt zqd qdzcx sn lnud sn hlldqrhud bntqrd";
        int secret = 25;
        Character decrypt = 'z';
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if( (int) str.charAt(i) + secret < 122){
                decrypt = (char) ((int) str.charAt(i) + secret);
                result += decrypt;
            }else{
                decrypt = (char) ((int) str.charAt(i) + secret - 24);
                result += decrypt;
            }

            System.out.println(decrypt);
            System.out.println((int) str.charAt(i));
            System.out.println((int) decrypt);
        }
        System.out.println(result);
    }
}
