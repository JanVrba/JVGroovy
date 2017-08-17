// date now

Date datum = new Date()
println(datum)
println(datum.toString())

// get date milisec from January 1, 1970, 00:00:00 GMT.

i=0
while (i<100) {
    Date datum = new Date()
    println("${i} : " + datum.getTime() + " milisec")
    i++
}

// other methods https://www.tutorialspoint.com/groovy/groovy_dates_times.htm