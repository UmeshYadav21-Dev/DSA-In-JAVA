public class Test {
    public static int arraySum(int arr[]) {
        int sum =0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,8,6};
         int res = arraySum(arr);
         System.out.println(res);
    }
}
