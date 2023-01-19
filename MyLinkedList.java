public class MyLinkedList {

    public Node Head;
    private  int len = 0;

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
    }

    public void add(int number){
        if(Head == null){
            Head = new Node(number);
        }else{
            Node tempHead = Head;
            while (tempHead.next != null){
                tempHead = tempHead.next;
                System.out.println(tempHead.data);
            }
            tempHead.next = new Node(number);

        }
    }

    public int get(int index){
        Node tempHead = Head;
        int tempIndex =0;
        if(index>=len){
            return  -1;
        }
        while (tempHead.next!= null&& tempIndex < index){
            tempHead = tempHead.next;
            tempIndex++;
        }
        return tempHead.data;
    }

    @Override
    public  String toString(){
        String resultString ="";
        Node tempHead = Head;
        while (tempHead.next!= null){
            resultString += tempHead.next;
            tempHead =tempHead.next;
        }
        resultString += tempHead.data + " ";

        return resultString;
    }

    class Node{

        int data;
        Node next;

        public Node(int date) {
            this.data = date;
        }

    }
}
