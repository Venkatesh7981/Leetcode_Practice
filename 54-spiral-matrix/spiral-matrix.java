class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;
        ArrayList<Integer> a=new ArrayList<>();
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                a.add(nums[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
               a.add(nums[j][right]);
            }
            right--;
            if(top<=bottom){
                for(int k=right;k>=left;k--){
                    a.add(nums[bottom][k]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    a.add(nums[i][left]);
                }
              left++;
            }
        }
        return a;
    }
}