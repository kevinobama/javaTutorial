package generic;

public class Box<T> extends AbstractBox<T> implements List<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }
   
   public int size() {
	   return 1;
   }

   public String toString() {
	   return null;
   }
   
   public String getData(T t) {
	   return t.toString();
   }
   
   public static void main(String[] args) {
      Box<Integer> integerBox = new Box<Integer>();
      Box<String> stringBox = new Box<String>();
    
      integerBox.add(new Integer(10));
      stringBox.add(new String("Hello World"));
      
      integerBox.setData(200);

      System.out.printf("Integer Value :%d\n\n", integerBox.get());
      System.out.printf("String Value :%s\n", stringBox.get());
      
      System.out.printf("Integer get data :%d\n\n", integerBox.getData());
   }
}