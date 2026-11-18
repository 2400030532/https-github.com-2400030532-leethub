/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode merge=dummy;
        while(head!=null && head.next!=null){
            int sum=0;
            if(head.val==0){
                while(head.next.val!=0 && head.next!=null){
                    sum+=head.next.val;
                    head=head.next;
                }
                if(sum>0){
                merge.next=new ListNode(sum);
                merge=merge.next;
                }
            }
            head=head.next;
        }
        return dummy.next;
    }
}