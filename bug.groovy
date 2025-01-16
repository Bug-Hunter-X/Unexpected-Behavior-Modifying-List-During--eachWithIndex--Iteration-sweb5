```groovy
def myMethod(list) {
  list.eachWithIndex { item, index ->
    if (item == null) {
      println "Null item found at index: $index"
      // Handle null item, e.g., remove it or replace with a default value
      list[index] = 'default'
    }
  }
}

myList = [1, 2, null, 4, 5]
myMethod(myList)
println myList
```