//Node.java code from MyLinkedList Repo

class Node{
  private Integer data;
  private Node next, prev;

  public Node(Integer val, Node otherNext , Node otherPrev){
    this.setData(val);
    this.next = otherNext;
    this.prev = otherPrev;
  }

  public Node next(){
    return next;
  }


  public Node previous(){
    return prev;
  }

  public void setNext(Node other){
    this.next = other;
    other.prev = this;
  }

  public void setPrev(Node other){
    this.prev = other;
    other.next = this;
  }

  public Integer getData(){
    return this.data;
  }

  public Integer setData(Integer val){
    Integer oldData = this.data;
    this.data = val;
    return oldData;
  }

  public String toString(){}

}
