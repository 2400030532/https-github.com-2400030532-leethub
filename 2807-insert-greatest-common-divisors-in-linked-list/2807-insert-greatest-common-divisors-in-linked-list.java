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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode node1=head;
        ListNode node2=head.next;
        if(head.next==null){
            return head;
        }
        while(node2!=null){
            int gcd=gcd(node1.val,node2.val);
            ListNode gcdd=new ListNode(gcd);
            node1.next=gcdd;
            gcdd.next=node2;
            node1=node2;
            node2=node2.next;
        }
        return head;
    }
    private static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}