// source : https://www.tutorialspoint.com/groovy/groovy_object_oriented.htm

// class with set,get

class Student {
   private int StudentID;
   private String StudentName;
	
   void setStudentID(int pID) {
      StudentID = pID;
   }
	
   void setStudentName(String pName) {
      StudentName = pName;
   }
	
   int getStudentID() {
      return this.StudentID;
   }
	
   String getStudentName() {
      return this.StudentName;
   }
	
   static void main(String[] args) {
      Student st = new Student();
      st.setStudentID(1);
      st.setStudentName("Joe");
		
      println(st.getStudentID());
      println(st.getStudentName());
   } 
}

// class without main method

class Student {
   private int StudentID;
   private String StudentName;
    
   void setStudentID(int pID) {
      StudentID = pID;
   }
    
   void setStudentName(String pName) {
      StudentName = pName;
   }
    
   int getStudentID() {
      return this.StudentID;
   }
    
   String getStudentName() {
      return this.StudentName;
   }
 }
Student st1 = new Student();
st1.setStudentName("John");
println ("Hello " + st1.getStudentName() + " !")

// subclass, superclass

class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
        
      st.Marks1 = 10;
      st.name = "Joe";
        
      println(st.name);
   }
} 

class Person {
   public String name;
   public Person() {}  
} 

class Student extends Person {
   int StudentID
   int Marks1;
    
   public Student() {
      super();
   } 
}  

// interface

class Example {
   static void main(String[] args) {
      Student st = new Student();
      st.StudentID = 1;
      st.Marks1 = 10;
      println(st.DisplayMarks());
   } 
} 

interface Marks { 
   void DisplayMarks(); 
} 

class Student implements Marks {
   int StudentID
   int Marks1;
    
  void DisplayMarks() {
   println(Marks1);
   }
} 