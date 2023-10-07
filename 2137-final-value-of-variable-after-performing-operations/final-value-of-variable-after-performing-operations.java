class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        int l = operations.length;

        for(int i=0; i<l; i++){

            switch(operations[i]){

                case "X++":{
                    x++;
                    break;
                }

                case "++X":{
                    ++x;
                    break;
                }

                case "X--":{
                    x--;
                    break;
                }

                case "--X":{
                    --x;
                    break;
                }

            }
        }
        return x;


    }
}