// source : https://www.tutorialspoint.com/groovy/groovy_closures.htm

// closure

def clos = {println "Hello World"};
clos.call();

// closure formal parameters

def clos = {param->println "Hello ${param}"};
clos.call("World");

// using it keyword

def clos = {println "Hello ${it}"};
clos.call("World");

// using variables

def str1 = "Hello";
def clos = {param -> println "${str1} ${param}"}
clos.call("World");

// closure as method param

class Example { 
   def static Display(clo) {
      // This time the $param parameter gets replaced by the string "Inner"         
      clo.call("Inner");
   } 
    
   static void main(String[] args) {
      def str1 = "Hello";
      def clos = { param -> println "${str1} ${param}" }
      clos.call("World");
        
      // We are now changing the value of the String str1 which is referenced in the closure
      str1 = "Welcome";
      clos.call("World");
        
      // Passing our closure to a method
      Example.Display(clos);
   } 
}
