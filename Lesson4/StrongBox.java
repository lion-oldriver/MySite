public class StrongBox<E>{
  private E data;
  private KeyType keyType;
  private long count;

  public StrongBox(KeyType key){
    this.keyType = key;
  }

  public void put(E data){
    this.data = data;
  }

  public E get(){
    this.count++;
    switch(this.keyType){
      case PADLOCK:
        if (count < 1024) return null;
        break;
      case BUTTON:
        if (count < 10000) return null;
        break;
      case DIAL:
        if (count < 30000) return null;
        break;
      case FINGER:
        if (count < 100000) return null;
        break;
    }
    this.count = 0;
    return this.data;
  }
}