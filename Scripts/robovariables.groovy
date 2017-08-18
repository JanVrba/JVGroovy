import groovy.xml.MarkupBuilder 
import groovy.util.*

def parser = new XmlParser()
def doc = parser.parse("C:\\Temp\\output.xml")
fail = doc.statistics.total.stat[1].attributes().fail
pass = doc.statistics.total.stat[1].attributes().pass
fail = fail.toInteger()
pass = pass.toInteger()
total = fail + pass
products = []
for (i=0;i < doc.suite.suite.size();i++) {
    products += doc.suite.suite[i].attributes().name
}
// attributes()
for (i=0;i < doc.suite.suite.suite.suite.suite[3].suite.size();i++) {   
    
    for (j=0; j < doc.suite.suite.suite.suite.suite[3].suite[i].test.size();j++) {
        println(doc.suite.suite.suite.suite.suite[3].suite[i].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[i].test[j].attributes().name)
    }
}

println(doc.suite.suite.suite.suite.suite[3].suite[0].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[0].test[0].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[0].test[0].status[0].attributes().status)
println(doc.suite.suite.suite.suite.suite[3].suite[0].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[0].test[1].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[0].test[1].status[0].attributes().status)
println(doc.suite.suite.suite.suite.suite[3].suite[0].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[0].test[2].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[0].test[2].status[0].attributes().status)
println(doc.suite.suite.suite.suite.suite[3].suite[0].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[0].test[3].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[0].test[3].status[0].attributes().status)
println(doc.suite.suite.suite.suite.suite[3].suite[0].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[0].test[4].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[0].test[4].status[0].attributes().status)

println(doc.suite.suite.suite.suite.suite[3].suite[1].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[1].test[0].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[1].test[0].status[0].attributes().status)

println(doc.suite.suite.suite.suite.suite[3].suite[2].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[0].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[0].status[0].attributes().status)
println(doc.suite.suite.suite.suite.suite[3].suite[2].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[1].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[1].status[0].attributes().status)
println(doc.suite.suite.suite.suite.suite[3].suite[2].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[2].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[2].status[0].attributes().status)
println(doc.suite.suite.suite.suite.suite[3].suite[2].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[3].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[3].status[0].attributes().status)
println(doc.suite.suite.suite.suite.suite[3].suite[2].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[4].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[4].status[0].attributes().status)
println(doc.suite.suite.suite.suite.suite[3].suite[2].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[5].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[5].status[0].attributes().status)
println(doc.suite.suite.suite.suite.suite[3].suite[2].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[6].attributes().name + " - " + doc.suite.suite.suite.suite.suite[3].suite[2].test[6].status[0].attributes().status)