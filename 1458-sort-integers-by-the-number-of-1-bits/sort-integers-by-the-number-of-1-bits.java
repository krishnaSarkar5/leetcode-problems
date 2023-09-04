class Solution {
    public int[] sortByBits(int[] arr) {

        Map<Integer,List<Integer>> map =  new HashMap<>();

        int size = arr.length;

        int min=0,max=0;

        int[] ans =  new int[size];

        for(int i=0;i<size;i++){

            int n = countSetBits(arr[i]);

            max = Math.max(max,n);
            min = Math.min(min,n);

            List<Integer> l = null;

            if(map.containsKey(n)){
                l = map.get(n);
            }else{
                l= new ArrayList<>();
            }

            l.add(arr[i]);
            map.put(n,l);

        }

        List<Integer> res = new ArrayList<>();


        for(int i = min;i<=max;i++){
            if(map.containsKey(i)){
               List<Integer> temp =  map.get(i);
               Collections.sort(temp);
                res.addAll(temp);
            }
        }

        for(int i=0;i<size;i++){
            ans[i] = res.get(i);
        }

        return ans;

    }



    static int countSetBits(int val){


        int count = 0;
        while(val>0){
            val = val & (val-1);
            count++;
        }

        return count;

    }
}