
// source : https://www.tutorialspoint.com/groovy/groovy_traits.htm
// implement trait 

class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.Marks1 = 10; 
      println(st.DisplayMarks());
   } 
} 

trait Marks { 
   void DisplayMarks() {
      println("Display Marks");
   } 
} 

class Student implements Marks { 
   int StudentID
   int Marks1;
}

// trait implements interfaces

class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.Marks1 = 10;
		
      println(st.DisplayMarks());
      println(st.DisplayTotal());
   } 
} 

interface Total {
   void DisplayTotal() 
} 

trait Marks implements Total {
   void DisplayMarks() {
      println("Display Marks");
   }
	
   void DisplayTotal() {
      println("Display Total"); 
   } 
} 

class Student implements Marks { 
   int StudentID
   int Marks1;  
} 

// extend traits

class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      println(st.DisplayMarks());
   } 
} 

trait Marks {
   void DisplayMarks() {
      println("Marks1");
   } 
} 

trait Total extends Marks {
   void DisplayMarks() {
      println("Total");
   } 
}  

class Student implements Total {
   int StudentID 
}