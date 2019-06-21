package binarysearch;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = 0;
        while(start+1 < end){
            mid = start + ( end - start ) / 2;
            if(isBadVersion(mid)){
                end = mid;
            }else{
                start = mid;
            }
        }
        if(isBadVersion(start)){
            return start;
        }
        if(isBadVersion(end)){
            return end;
        }
        return 0;
    }
    }
