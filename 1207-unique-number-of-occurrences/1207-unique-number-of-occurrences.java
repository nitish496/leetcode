class Solution {
    public boolean uniqueOccurrences(int[] arr) {

      Map<Integer,Integer>mp = new HashMap<>();

      for(int i=0;i<arr.length;i++){
          int ce = arr[i];

          if(!mp.containsKey(ce)){
            mp.put(ce,1);
          }else{
            int freq = mp.get(ce);
            mp.put(ce,freq+1);
          }
      }

      Set<Integer>st = new HashSet<>();
      for(int key:mp.keySet()){
         int val = mp.get(key);
         if(st.contains(val)){
            return false;
         }else{
            st.add(val);
         }
      }
      return true;
    }
}