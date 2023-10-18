class OrderedStream {

    private int currentIndex;

    private int total;

    private String[] arr;

    public OrderedStream(int n) {
        this.currentIndex = 0;
        arr = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {


        arr[idKey-1]=value;

       
        List<String> ans = new ArrayList<>();

        int len = arr.length;

        while(currentIndex < len && arr[currentIndex] != null){

            ans.add(arr[currentIndex]);

            currentIndex++;

        }

        return ans;

        

    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */