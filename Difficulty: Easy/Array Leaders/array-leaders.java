class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
         int maxRight = 0;
         for(int i = arr.length - 1; i >= 0; i--){
             if(arr[i]>=maxRight){
                 list.add(arr[i]);
                 maxRight = arr[i];
             }
         }
             Collections.reverse(list);
             return list;
    }
}