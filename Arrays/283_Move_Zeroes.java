package Arrays;

class Solution {
    public void moveZeroes(int[] a) {
        int n=a.length,j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                swap(a,i,j);
                j++;

            }
        }
    }
    public void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
