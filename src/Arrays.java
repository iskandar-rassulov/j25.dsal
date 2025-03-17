
public class Arrays {

    public static void main(String[] args){

        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println("Sum of array is " + sumOfArray(arr));
        System.out.println("Average of array is " + avgValOfArray(arr));
        System.out.println("Max of array is " + maxOfArray(arr));
        System.out.println("Min of array is " + minOfArray(arr));
        System.out.println("Reversed array is " + java.util.Arrays.toString(reverseArray(arr)));
    }

    public static int sumOfArray(int[] arr){
        int res = 0;

        for (int j : arr) {
            res += j;
        }
        return res;
    }

    public static int avgValOfArray(int[] arr){
        int avg = 0;
        for (int j : arr){
            avg += j;
        }
        avg = avg / arr.length;
        return avg;
    }

    public static int maxOfArray(int[] arr){
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int minOfArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int j : arr){
            if(j < min){
                min = j;
            }
        }
        return min;
    }

    public static int[] reverseArray(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

}
