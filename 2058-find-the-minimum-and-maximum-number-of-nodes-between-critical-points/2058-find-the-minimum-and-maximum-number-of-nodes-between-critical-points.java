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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer>l=new ArrayList<>();
        int min=Integer.MAX_VALUE,max=-1;
        ListNode ptr=head;
        int c=0;
        while(ptr.next!=null && ptr.next.next!=null){
            if((ptr.next.val<ptr.next.next.val && ptr.val>ptr.next.val)||(ptr.next.val>ptr.next.next.val && ptr.val<ptr.next.val)){
                l.add(c);
            }
            c++;
            ptr=ptr.next;
        }
        if(l.size()<2){
            return new int[] {-1,-1};
        }
        for(int i=0;i<l.size()-1;i++){
            min=Math.min(l.get(i+1)-l.get(i),min);
            
        }
        max=l.get(l.size()-1)-l.get(0);
        return new int[] {min,max};
    }
}