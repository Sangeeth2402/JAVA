class SLL{
    node Head;
    class node{
        int data;
        node next;
        node(val){
            data=val;
            next=null;
        }
    }
}
LinkedList(){
    Head==null;
}
 insert begin(val){
    Node.newNode=new Node(val);
    if(Head==null){
        Head=new node;
    }else{
        new node.next=Head;
        Head=new node;
    }
 }
 public void display();
 Node temp=Head ;
 while(temp!=null){
    System.out.print(temp.data+" ");
    temp=temp.next;
 }
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    LinkedList = new LinkedList();
    int n=sc.nextInt();
    for(int i=0;i;i<n;i++){
        
    }
}
