// file , eachline , class java.io.File

new File ("C:/Temp/File.txt").eachLine {
    line -> println "$line"; 
}

// read file

File file = new File("C:\\Temp\\File.txt")
println file.text

// write to file

new File("C:\\Temp\\File.txt").withWriter('utf-8') { 
    writer -> writer.writeLine 'Hello World'
}

// file size

File file = new File("C:\\Temp\\File.txt") 
println "The file ${file.absolutePath} has ${file.length()} bytes"

// check if is file or dir

def file = new File("C:\\Temp") ;
if (file.isFile()) {
    println("${file.absolutePath} is file");
} else {
   println("${file.absolutePath} is not file");
}

// create dir

def file = new File("C:\\Temp\\NewDir") ;
if (!file.isFile()) {
    println("${file.absolutePath} is not file");
    file.mkdir();
}

// delete file

def file = new File("C:\\Temp\\file.txt") ;
println("Deleting ${file.absolutePath} ...");
file.delete();
println("${file.absolutePath} deleted!");

// copy content from one file to another

def src = new File("C:/Temp/file.txt")
def dst = new File("C:/Temp/NewDir/file.txt")
dst << src.text

// list of files at directory

new File("C:/Temp").eachFile() {  
    file->println file.getAbsolutePath()
}