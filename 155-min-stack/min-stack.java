class MinStack {

    private List<Pair> st = new ArrayList<>();

    private int top = -1;

    public MinStack() {

    }

    public void push(int val) {
        if (st.size() == 0) {
            Pair data = new Pair(val,val);
            st.add(data);
            top++;
        } else {
            Pair prevData = st.get(top);
            Pair data = new Pair(val,Math.min(prevData.getMin(),val));
            st.add(data);
            top++;
        }
    }

    public void pop() {
        if(top>=0){
            st.remove(top);
            top--;
        }
           
    }

    public int top() {
        return st.get(top).getData();
    }

    public int getMin() {
        return st.get(top).getMin();
    }
}

class Pair{
    private int data;
    private int min;

    public Pair(int data,int min){
        this.data=data;
        this.min=min;
    }

    public int getData(){
        return this.data;
    }
     public int getMin(){
        return this.min;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */