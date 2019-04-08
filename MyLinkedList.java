//ENTER CODE FROM MYLINKEDLIST REPO

class MyLinkedList{
  private int size;
  private Node start, end;

  public MyLinkedList(){
    size = 0;
    start = null;
    end = null;
  }

  public int size(){
    return size;
  }


  public boolean add(Integer value){
    if(size == 0){
      start = new Node(value, null, null);
      end = start;
      return true;
    }
    Node n = new Node(value, null, end);
    size++;
    end = n;
    return true;
  }

  public void add(int index, Integer value){
    if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException();
    }
    Node n = new Node(value, getNthNode(index), getNthNode(index).previous()); //requires getNthNode Method
    size++;
    if(index == size - 1){
      end = n;
    }
  }

  private Node getNthNode(int index){
    int counter = 0;
    Node currentNode = start;
    while(currentNode != null){
      if(counter == index){
        return currentNode;
      }
      currentNode = currentNode.next();
      counter++;

    }
    return currentNode;
  }

  public Integer get(int index){
    if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException();
    }
    return getNthNode(index).getData();
  }

  public Integer set(int index, Integer value){
    if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException();
    }
    return getNthNode(index).setData(value);
  }

  public boolean contains(Integer value){
    Node currentNode = start;
    while(currentNode != null){
      if(currentNode.getData().equals(value)){
        return true;
      }
      currentNode = currentNode.next();
    }
    return false;
  }

  public int indexOf(Integer value){
    Node currentNode = start;
    int counter = 0;
    while(currentNode != null){
      if(currentNode.getData().equals(value)){
        return counter;
      }
      currentNode = currentNode.next();
      counter++;
    }
    return -1;
  }

  public Integer remove(int index){
    if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException();
    }

    Integer oldData = getNthNode(index).getData();

    getNthNode(index - 1).setNext(getNthNode(index + 1));
    size--;
    return oldData;
  }

  public boolean remove(Integer value){
    if(!contains(value)){
      return false;
    }
    Node currentNode = start;
    while(currentNode.getData() != value){
      currentNode = currentNode.next();
    }
    currentNode.previous().setNext(currentNode.next());
    size--;
    return true;
  }

  public String toString(){
    String str = "[";
    Node currentNode = start;
    while(currentNode != null){
      str += currentNode.getData() + ", ";
      currentNode = currentNode.next();
    }
    str += "]";
    return str;
  }

  public void extend(MyLinkedList other){

    if(other.start != null){
      if(start == null){
        start = other.getNthNode(0);
        end = other.getNthNode(size - 1);
        size = other.size();
        other.clear();
      }else{
        end.setNext(other.start());
        other.getStart().setPrev(end);
        end  = other.getEnd();
        size += other.size;
        other.clear;
    }

  }
}
