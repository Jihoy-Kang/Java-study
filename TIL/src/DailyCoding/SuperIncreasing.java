package DailyCoding;

public class SuperIncreasing {
    public static void main(String[] args) {
        int[] arr = new int[]{979, 1737, -2146, -337, 1316};
        int sum = arr[0];
        for (int i = 1; i<arr.length-1;i++) {
            if(sum >= arr[i]){
                System.out.println(false);
            }
            sum+=arr[i];
        }
        System.out.println(true);
        System.out.println(sum);

    }
}
