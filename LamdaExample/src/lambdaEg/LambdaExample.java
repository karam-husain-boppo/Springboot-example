package lambdaEg;
public class LambdaExample{  
    public static void main(String[] args) {  
      Runnable r= new Runnable() {
    	  public void run() {
    		  System.out.println("first thread is running");
    		  
    	  }
      };
      Thread t= new Thread(r);
      t.start();      
    }
    Runnable r2 = new Runnable
}