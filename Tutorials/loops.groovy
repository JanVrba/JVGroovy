// while loop

i = 0
while(i < 5) { 
   println(i)
   i++   
}

// for loop

for(i=0;i < 5;i++) { 
   println(i)   
}

// for in loop

int[] array = [0,1,2,3];        
for(int i in array) { 
         println(i); 
}

// for in maps

def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];        
for(emp in employee) {
         println(emp);
}