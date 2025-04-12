package Tree.LL;

public class Implementation {
    class LL{
        int value;
        LL next;
        LL( int data){
            data=value;
            next=null;

        }
    }
    LL obj1=new LL(1);
    LL obj2=new LL(2);
    LL obj3=new LL(3);
    public Implementation(){
        obj1.next=obj2;
        obj2.next=obj3;

    }
}