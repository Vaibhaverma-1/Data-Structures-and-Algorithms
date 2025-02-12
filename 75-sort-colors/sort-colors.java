class Solution {
    public void sortColors(int[] a) {
        int low=0;
        int mid=0;
        int high=a.length-1;;
        for(int i=0; i<a.length; i++){
            if(a[mid]==0){
                int temp = a[mid];
                a[mid]=a[low];
                a[low]=temp;
                mid++;
                low++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else if(a[mid]==2){
                int temp =a[high];
                a[high]=a[mid];
                a[mid]=temp;
                high--;
                
            }
        
        }
            
    }
}