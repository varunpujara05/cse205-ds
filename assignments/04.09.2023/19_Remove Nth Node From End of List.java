class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    int c=0;
    ListNode tmp=head;
    while(tmp!=null)
    {
        tmp=tmp.next;
        c++;
    }
    if(n==c)
    {
        head=head.next;
        return head;
    }
    int req_node=c-n;
    int i=1;
    ListNode l1=head;
    while(i<req_node)
    {
        l1=l1.next;
        i++;
    }
    l1.next=l1.next.next;
    return head;
    }
}