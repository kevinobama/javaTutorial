package generic;

public class AbstractBox<T> {
	   private T t;

	   public void setData(T t) {
	      this.t = t;
	   }
	   
	   public T getData() {
		      return t;
	   }	   
}
