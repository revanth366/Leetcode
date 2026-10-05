class Node{
    Node prev;
    Node next;
    String data;
    public Node(String data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class BrowserHistory {
    Node head;
    public BrowserHistory(String homepage) {
        head=new Node(homepage);
    }
    
    public void visit(String url) {
        Node newPage=new Node(url);
        head.next=newPage;
        newPage.prev=head;
        head=newPage;
    }
    
    public String back(int steps) {
        while (steps > 0 && head.prev != null) {
            head = head.prev;
            steps--;
        }
        return head.data;
    }
    
    public String forward(int steps) {
        while (steps > 0 && head.next != null) {
            head = head.next;
            steps--;
        }
        return head.data;   
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */