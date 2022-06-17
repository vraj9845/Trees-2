//Time Complexity:O(n)
// Space Complexity:O(n)
class Solution {
    Stack<Integer> st = new Stack<>();
    int sum=0;
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        st.push(root.val);
        sumNumbers(root.left);
        sumNumbers(root.right);
        if(root.right==null && root.left==null){
            int x=calculate();
            sum=sum+x;
        }
        st.pop();
        return sum;
    }
    
    public int calculate(){
        System.out.println("Cal");
        int temp=0;
        double a = 10;
        double p = st.size()-1;
        Double tensPlace=Math.pow(a,p);
        for(Integer item:st){
            temp=temp+(tensPlace.intValue()*item);
            tensPlace=tensPlace/10;
        }
        return temp;
    }
}
