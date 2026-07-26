class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int z = nums1.length + nums2.length;
        int arr[] = new int [z];
        int k = 0;
        for(int i = 0;i<nums1.length;i++){
            arr[k]=nums1[i];
            k++;
        }
        for(int i = 0;i<nums2.length;i++){
            arr[k] = nums2[i];
            k++;
        }
        Arrays.sort(arr);
         double Median = 0;
        if(arr.length % 2 != 0){
            Median = arr[z/2] ;
        }
        else{
            Median = (arr[z/2 - 1] + arr[z/2]) / 2.0 ;
        }
        
        
        return  Median;
    }
}