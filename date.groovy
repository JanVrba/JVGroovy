// date now

Date datum = new Date()
println(datum)
println(datum.toString())

// get date milisec from 1.1.1970

i=0
while (i<100) {
    Date datum = new Date()
    println("${i} : " + datum.getTime() + " milisec")
    i++
}