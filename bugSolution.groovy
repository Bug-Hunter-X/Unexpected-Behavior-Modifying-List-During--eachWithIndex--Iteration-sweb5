```groovy
def myMethod(list) {
  def newList = []
  list.eachWithIndex { item, index ->
    if (item == null) {
      println "Null item found at index: $index"
      item = 'default'
    }
    newList << item
  }
  return newList
}

myList = [1, 2, null, 4, 5]
myList = myMethod(myList) // or myList = list.collect{it ?: 'default'}
println myList

//Alternatively, use collect to create a new list:
myList = [1,2,null,4,5]
myList = myList.collect { it ?: 'default' }
println myList
```