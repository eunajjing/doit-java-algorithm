
public class MyStack {
  private Object[] stackArr;
  private int index;
  
  public MyStack(int objectSize) {
    stackArr = new Object[objectSize];
    this.index = 0;
  }
  
  public boolean empty() { // 스택이 비었는지 확인
    return (index == 0)?true:false;
  }
  
  public boolean full() { //스택이 풀인지 확인
    return (index == stackArr.length)?true:false;
  }
  
  public void push(Object i) {
    stackArr[index++] = i;
  }
  
  public Object pop() {
    return stackArr[--index];
  }

}
