import java.io.*;


public class ll{
    Node head; // a variabl of class node used to point to head

    static class Node{

        int data;
        Node next;

        Node (int d){
            data = d;
            next = null;
        }
    }

    public static void middleELe(ll list){

        if(list.head == null){
            System.out.println("The list is empty");
        }
        else if(list.head.next == null){
            System.out.println("The middle element is head itself : " + list.head.data);
        }else{
            int count = 0,mid;

            Node curr = list.head;
            while(curr != null){
                curr = curr.next;
                count++;
            }

            if(count%2 != 0){
                mid = count/2;
                list = deleteAtpos(list, mid);
            }
            else{
                mid = count/2;
                System.out.println("Deleting middle two elements: ");
                list = deleteAtpos(list, mid-1);
                list = deleteAtpos(list, mid);
            }
        }

    }

    public static ll deleteAtpos(ll list, int index){
        Node prev = null;

        /// CASE 1: when head has to be deleted
        if(index == 0 && list.head != null){
            System.out.println("Element at pos[" + index + "]:" + list.head.data + " is deleted" );
            list.head = list.head.next;
        }
        else{

            // CASE 2: when some other post to be deleted
            Node temp = list.head;
            prev = temp;
            int count = 0;

            while(temp != null){
                if(count == index){
                    prev.next = temp.next;
                    System.out.println("Element at pos[" + index + "]:" + temp.data + " is deleted" );
                    break;
                }else{
                    count++;
                    prev = temp;
                    temp = temp.next;
                }
                
            }

            // CASE 3: if the element is not found
            if(temp == null){
                System.out.println("The postion is not found");

            }
        }
        return list;

    }

    public static ll deletekey(ll list,int key){
        Node temp = list.head;
        
        // CASE1 : head has the key
        if(temp != null && temp.data == key){
            list.head = temp.next;
            System.out.println(key + " Key Found and deleted");
            return list;
        }
        else if(temp != null && temp.data != key){
            
            Node prev = null;
            while(temp != null){
                prev = temp;
                if(temp.data == key){
                    temp = temp.next;
                    prev.next = temp.next;
                    System.out.println(key + "Key Found and deleted");
                    return list;
                }
                temp = temp.next;
            }

            if(temp == null){
                System.out.println(key + "Key Not Found");
            }
        }
        return list;
    
    }

    public static ll insert(ll list,int data){
        Node newnode = new Node(data);
        newnode.next = null;

        if(list.head == null){
            list.head = newnode; 

        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newnode;

        }

        return list;
    }

    public static void print(ll list){
        Node curr = list.head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }



    public static void main( String args[]){
        ll  l = new ll();

        l = insert(l,1);
        l = insert(l,3);
        l = insert(l,4);
        l = insert(l,5);
        l = insert(l,4);
        l = insert(l,8);
        l = insert(l,5);
        
        print(l);

        l = deleteAtpos(l, 2);

        System.out.println("After Deletion");
        print(l);

        l = deleteAtpos(l, 0);

        System.out.println("After Deletion");
        print(l);

        l = deleteAtpos(l, 9);

        System.out.println("After Deletion");
        print(l);
    }
}


















/*
public class ll{

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
        }
    }

    public static ll insert(ll list,int ele){

        // Create new node to store the element to be inserted
        Node new_node = new Node(ele);
        new_node.next = null;

        if(list.head == null){
            list.head = new_node;
        }
        else{

            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }

        return list;// need not return or reassign to list as it is a pointer the data is manipulated anyways
    }

    public static void printlist(ll list){

        Node temp = list.head;

        System.out.println("LinkedList: "); 
        
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String arg[]){

        ll  list = new ll();

        list = insert(list,1);
        list = insert(list,2);

        printlist(list);
    }
}

*/