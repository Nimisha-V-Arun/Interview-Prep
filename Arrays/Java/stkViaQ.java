import java.util.*;

class stkViaQ{

    Queue<Integer> q1;
    Queue<Integer> q2;

    int curr;

    stkViaQ(){
        this.curr = 0;
    }

    void push(int n){
        q1.add(n);

        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q1;
        curr++;
        System.out.println(111);
    }

    void pop(){
        if(q1.isEmpty()){
            return;
        }
        q1.remove();
        curr--;
    }

    int top(){
        if(q1.isEmpty())
            return -1;
        else
            return q1.peek();
    }


    public static void main(String args[]){

        
        stkViaQ s = new stkViaQ();

        s.q1 = new LinkedList<Integer>();
        s.q2 = new LinkedList<Integer>();
        s.push(1);
        System.out.println(s.top());
        s.push(2);
        System.out.println(s.top());
        s.push(3);
        System.out.println(s.top());
        s.push(4);
        System.out.println(s.top());
        
        s.pop();
        System.out.println(s.top());

        s.pop();
        System.out.println(s.top());


    }
}