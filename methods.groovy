// simple method without parameters

def displayname(){
    println("This is simple method");
}
displayname();

// method with parameters

def sum(int a,int b){
    int c = a+b;
    println(c);
}
sum(5,30);

// method with default parameters

def sum(int a,int b = 6){
    int c = a+b;
    println(c);
}
sum(500);

// method return values

def sum(int a,int b){
    int c = a+b;
    return c;
}
d = sum(6,5);
println(d);

// method inside class

class Example { 
   int x; 
    
   public int getX() { 
      return x; 
   } 
    
   public void setX(int pX) { 
      x = pX; 
   } 
    
   static void main(String[] args) { 
      Example ex = new Example(); 
      ex.setX(100); 
      println(ex.getX()); 
   } 
}

// method with local parameters\

class Example { 
   static int x = 100; 
    
   public static int getX() { 
      int lx = 200; 
      println(lx); 
      return x; 
   } 
    
   static void main(String[] args) { 
      println(getX());     
   }  
}