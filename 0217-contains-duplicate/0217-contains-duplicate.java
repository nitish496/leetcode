class Solution {
    public boolean containsDuplicate(int[] nums) {
HashSet<Integer>Seen = new HashSet<>();
for(int num:nums){
    if(Seen.contains(num)){
         return true;
    }
    Seen.add(num);
}
return false;
}
}