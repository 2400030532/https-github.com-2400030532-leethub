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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ptr=list1;
        ListNode ptr2=list1;
        ListNode q=list2;
        int c=b-a+1;
        while(a-->1){
            ptr=ptr.next;
            ptr2=ptr2.next;
        }
        while(c-->0){
            ptr2=ptr2.next;
        }
        ptr2=ptr2.next;
        ptr.next=q;
        while(q.next!=null){
            q=q.next;
        }
        q.next=ptr2;
        return list1;
    }

}