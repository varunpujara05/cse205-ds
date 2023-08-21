class Solution {
    public List<List<Integer>> subsets(int[] num) {
        List<Integer> list1 = new ArrayList<>();
        List <List<Integer>> list2 = new ArrayList<>();
        sub(num,list1,list2,0);
        return list2;
    }
    public static void sub(int[] num,List<Integer> list1,List <List<Integer>> list2,int n)
    {
        if(num.length==n)
        {
            list2.add(new ArrayList<>(list1));
            return;
        }
        list1.add(num[n]);
        sub(num,list1,list2,n+1);
        list1.remove(list1.size()-1);
        sub(num,list1,list2,n+1);
    }
}