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
tests = []

for (i=0;i< products.size();i++) {   
    if (doc.suite.suite.suite.suite.suite[i].suite.size() > 0) {
        for (j=0;j < doc.suite.suite.suite.suite.suite[i].suite.size();j++){
           for (k=0;k < doc.suite.suite.suite.suite.suite[i].suite[j].test.size();k++) {

                testsuite = doc.suite.suite.suite.suite.suite[i].suite[j].attributes().name
                test =  doc.suite.suite.suite.suite.suite[i].suite[j].test[k].attributes().name
                status = doc.suite.suite.suite.suite.suite[i].suite[j].test[k].status[0].attributes().status               
                tests += "Product: " + products[i] + "; Test suite name: " + testsuite + "; Test name: " + test + " -> Status: " + status
            }
        }
    }
}

tests.each {
    println(it)
}