public class ReverseArray {

    public static void main(String [] args) {
        int arr [] = new int [] {1,2,3,4,5,6};
        reverse(0,arr.length-1,arr);
        for(int i : arr) {
            System.out.println(i);
        }
        
    }
    public static void reverse(int start,int end, int arr[] ) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}