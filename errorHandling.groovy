// try catch

try {
    def arr = new int[3];
    arr[5] = 5;
} catch(Exception ex) {
    println("Catching the exception: " + ex);
}
println("Continue..."); 

// multiple try catch

try {
    def arr = new int[3];
    arr[5] = 5;
} catch (ArrayIndexOutOfBoundsException arex) {
    println("Catching the ArrayException: " + arex);
} catch(Exception ex) {
    println("Catching the exception: " + ex);
}
println("Continue..."); 

// finally

try {
    def arr = new int[3];
    arr[2] = "hkhkh";
} catch (ArrayIndexOutOfBoundsException arex) {
    println("Catching the ArrayException: " + arex);
} catch (IllegalArgumentException ilex) {
    println("Catching the IlleException: " + ilex);
} catch(Exception ex) {
    println("Catching the exception: " + ex);
} finally {
    println("That's all folks");
}
println("Continue..."); 

// error methods

//File file = new File("E://file.txt");
//FileReader fr = new FileReader(file);
try {
    def arr = new int[3];
    arr[2] = "hkhkh";
} catch (ArrayIndexOutOfBoundsException arex) {
    println("Catching the ArrayException: " + arex);
} catch (IllegalArgumentException ilex) {
    println("Catching the IlleException: " + ilex);
    println("Detail: " + ilex.getMessage());
    println("Cause: " + ilex.getCause());
    println("Class: " + ilex.toString());
    println("StackTrace: " + ilex.getStackTrace());
} catch(Exception ex) {
    println("Catching the exception: " + ex);
} finally {
    println("That's all folks");
}
println("Continue..."); 