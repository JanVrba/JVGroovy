// int array

int[] array = [1,2,3]
num = 1
println ("Pozice " + num + " je " + array[num])

// string list

def list = []
list.add("Hello")
list.add("World")
list.each {
    println("${it}")
}

// map

def map = [:]
map+=['key1' : 'value1']
map+=['key2' : 'value2']
map.put('key3','value3')
println(map)
println(map.keySet())
println(map.values())
println(map.size())

// each

def map = [:]
map+=['key1' : 'value1']
map+=['key2' : 'value2']
map.put('key3','value3')
map.each {println it}
map.each {println "${it.key} maps to: ${it.value}"}