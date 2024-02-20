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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //creating a dummy list 
        ListNode dummy = new ListNode(0);
        //initialising an pointer li hta huwa listeNode li aykhod pardefaut dummy liste
        ListNode current = dummy;
        //anhtaju wahed l carry why? cas de 4+6>=10 alors carre =1  sinon 14+6 => carre =2 i heya 3acharat excetra so   carre = somme % 10
        int carre = 0;
        //ida wahda mn hadchi  mzyan = normal dkhol l while
        while (l1 != null || l2 != null || carre ==1){
            //initialisation du somme
            int sum =0;
            if(l1!= null){
                //anzido value l sum
                sum += l1.val;
                //moving l1
                l1=l1.next;
            }
            if(l2!= null){
            //anzido value l sum lihuwa l1
            sum += l2.val;
            //moving l2
            l2=l2.next;
            }
            //if we have a carre so aykhasna nzidoh ofcourse
            sum += carre;
            //ila can aykhesna ndevidew ela 10 bach n9dero nakhooh tani
            carre = sum/10;
            // hadik l value li khdena aykhsha trje3  hta hya node exemple 4+16=20 ankhliw 0 f somme o 2 atrhe3 node
            ListNode node = new ListNode(sum%10);
            // current aypointi ela node jdida
            current.next = node;
            //moving to the next
            current = current.next;
        }
     return dummy.next;
    
}
}
