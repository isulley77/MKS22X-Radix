public class Radix{
  
  public static void radixsort(int[] data){
    
    if(data.size != 0){
      @SuppressWarnings("unchecked") MyLinkedList<Integer>[] dig = new MyLinkedList[20];
      
      for(int i = 0; i < 20; i++){
        dig[i] = new MyLinkedList<Integer>();
      }
   
      MyLinkedList<Integer> pos = new MyLinkedList<>();
    
    for(int n : data){
      if(n > 0){
        pos.add(n);
        pos.remove(n);
      }
    }
      
      if(pos.size() > 0){
      
      for(int i = 1; 
        
      }
  
  }
  
  public static int max(int[] data)
  }
  
  public static int getDigit(int i){
  }
  
  public static void main(String[] args){}
  
 }
