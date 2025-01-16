This repository demonstrates an uncommon Groovy bug related to modifying a list while iterating using `eachWithIndex`. The bug arises because `eachWithIndex` creates an iterator that doesn't reflect changes made to the list during iteration.

The `bug.groovy` file contains code that attempts to handle null values in a list using `eachWithIndex`. However, the list modification within the loop doesn't update the list being iterated over, potentially leading to incorrect results. 

The `bugSolution.groovy` demonstrates a correct approach using `eachWithIndex` and handling null values safely without unexpected behavior.  It also explains the alternative solution.