public class Linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
     /******    Add First    ***** */
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return ;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    /********    AddLast     ***********/
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    /******* Add Middel******* */
    public void addMiddle(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return ;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i =0;
        while(i < idx-1){
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    /*******  remove First *****/

    public int removeFirst(){
        if(size ==0){
          System.out.println(" LL is Empty");
          return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;

        return val;
    }

    /****** Remove Last ******/
    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    /********** Print Linkedlist ******* */
    public void print(int data){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String main[]){
        Linkedlist ll = new Linkedlist();
        
        ll.addFirst(3);
        
       
        ll.addFirst(2);
       
        ll.addLast(4);
        
        ll.addLast(5);
       
        ll.addLast(6);
        ll.addMiddle(0, 01);
        ll.print(0);
        ll.removeFirst();
        ll.print(0);
        ll.removeLast();
        System.out.println("Size = "+size);
    }
}
