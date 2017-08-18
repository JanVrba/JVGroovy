// source : https://www.tutorialspoint.com/groovy/groovy_generics.htm
// generalized list

class Example {
   static void main(String[] args) {
      // Creating a generic List collection
      List<String> list = new ArrayList<String>();
      list.add("First String");
      list.add("Second String");
      list.add("Third String");
		
      for(String str : list) {
         println(str);
      }
   } 
}

// generalized class

class Example {
   static void main(String[] args) {
      // Creating a generic List collection 
      ListType<String> lststr = new ListType<>();
      lststr.set("First String");
      println(lststr.get()); 
        
      ListType<Integer> lstint = new ListType<>();
      lstint.set(1);
      println(lstint.get());
   }
} 

public class ListType<T> {
   private T localt;
    
   public T get() {
      return this.localt;
   }
    
   public void set(T plocal) {
      this.localt = plocal;
   } 
}