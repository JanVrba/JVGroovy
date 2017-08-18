import groovy.xml.MarkupBuilder 
import groovy.util.*

def parser = new XmlParser()
def doc = parser.parse("C:\\Temp\\output.xml")
fail = doc.statistics.total.stat[1].attributes().fail
pass = doc.statistics.total.stat[1].attributes().pass
fail = fail.toInteger()
pass = pass.toInteger()
total = fail + pass