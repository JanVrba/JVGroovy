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
