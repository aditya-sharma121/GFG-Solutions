 class Solution {
      public void sort012(int[] arr) {
          // code here
          int p = 0;
          int q = 0;
          int r = arr.length - 1;
          while(p <= r){
              if(arr[p] == 0){
                  int a = arr[p];
                  arr[p] = arr[q];
                  arr[q] = a;
                  p++;
                  q++;
              }
              else if(arr[p] == 1){
                  p++;
              }
              else {
                  int a = arr[p];
                  arr[p] = arr[r];
                  arr[r] = a;
                  r--;
              }

          }
      }
  }

