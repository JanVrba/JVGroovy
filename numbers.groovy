// convert to other type

nume = new Integer(5)
println(nume.intValue())
println(nume.byteValue())
println(nume.doubleValue())
println(nume.floatValue())
println(nume.shortValue())
println(nume.longValue())

// compare

nume = new Integer(5)
println(nume.compareTo(5))
println(nume.compareTo(4))
println(nume.compareTo(6))

// equals

nume = new Integer(5)
if (nume.equals(6)) {
    println("Number ${nume} is same")
} else {
    println("Number ${nume} is not same")
}

// value of

nume = new Integer(5);
Integer nume1 = Integer.valueOf(nume); 
println(nume1)

// toString

nume = new Integer(5);
println(nume.toString())

// random

i=0
while (i<100) {
    println("Number ${i}: " + Math.random());
    i++
}

// other methods : https://www.tutorialspoint.com/groovy/groovy_numbers.htm