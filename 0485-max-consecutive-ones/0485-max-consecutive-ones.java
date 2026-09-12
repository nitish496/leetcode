class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int m=0;
      int c=0;

      for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            c+=1;
            m=Math.max(c,m);
        }else{
            c=0;
        }
      }
      return Math.max(c,m);
     }   
     
    }
