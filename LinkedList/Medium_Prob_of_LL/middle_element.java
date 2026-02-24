package LinkedList.Medium_Prob_of_LL;

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class middleElement{
    ListNode getMid(ListNode head){
        ListNode temp = head;
        int count = 1;
        //check count
        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        int mid = 0;

        if(mid % 2 == 0){
            mid = (count / 2);
        }else{
            mid = (count / 2) + 1;
        }

        temp = head;

        int countt = 0;
        while(countt != mid){
            temp = temp.next;
            countt++;
        }
        return temp;
    }
}


public class middle_element {
    public static void main(String[] args) {
        ListNode head = null;

        for (int i = 1; i <= 5; i++) {
            ListNode newNode = new ListNode(i);
            if (head == null) {
                head = newNode;
            } else {
                ListNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        middleElement m = new middleElement();
        ListNode out = m.getMid(head);

        while(out != null){
            System.out.print(out.val + " -> " );
            out = out.next;
        }

        System.out.print("null");

        

    }
}
