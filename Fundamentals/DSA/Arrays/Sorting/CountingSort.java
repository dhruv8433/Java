// time complexity = O(n+k) where n is the number of elements in input array and k is the range of input. 

package Arrays.Sorting;

public class CountingSort {
    public static void CountingSorting(int arr[]){

        int[] countingArr = new int[10]; 
        int[] outputArr = new int[arr.length];
        
        // default initial value for countingarr is 0
        for(int i=0; i<countingArr.length; i++){
            countingArr[i] = 0;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println("arr[i] "+arr[i]);
            countingArr[arr[i]]++;
            // coutinngArr[2]++ = [0, 1, 1, 0, 0, 0, 0, 0, 0, 0 , 0 , 0 , 0 ,0]
        }

        for(int i:countingArr){
            System.out.print(i+" ");
        }

        // now we are increment by next position in counting array means spz, [2 2 4] = [2 4 8]
        for(int i=1; i<countingArr.length; i++){
            countingArr[i] += countingArr[i-1];
        }

        System.out.println();

        // let's see counting updated array
        for(int i:countingArr){
            System.out.print(i+" ");
        }

        // output array
        for(int i=arr.length-1; i>=0; i--){
            outputArr[countingArr[arr[i]]-1] = arr[i];
        }

        System.out.println();
        System.out.println("Output Array");
        for(int i:outputArr){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,1,1,0,2,5,4,0,2,8,7,7,9,2};
        CountingSorting(arr);
    }   
}
