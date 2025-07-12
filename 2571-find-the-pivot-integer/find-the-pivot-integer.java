class Solution {
    public int pivotInteger(int n) {

        double totalSum = n*(n+1)/2;
        double x = Math.sqrt(totalSum);
        if(x-Math.ceil(x)==0)
            return (int) x;
        else
            return -1;

    }
}