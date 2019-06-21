package binarysearch;

public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int low = 0;
        int high = A.length -1;
        int mid = 0;
        while(low+1<high){
            mid = low + (high-low)/2;
            if(A[mid]>A[mid-1] && A[mid]>A[mid+1]){
                return mid;
            }else if(A[mid]>A[mid-1]){
                low=mid;
            }else{
                high= mid;
            }
        }
        if(A[low]>A[low-1] && A[low]>A[low+1]){
            return low;
        }

        return high;
    }
}
