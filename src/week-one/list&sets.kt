package `week-one`
fun main() {
    //------------------------------*LISTS*------------------------------
    //------------------------------IMMUTABLE LIST *can't be modified*------------------------------
    //if list is not empty datatype is "implicit"
//    val names = listOf("anas", "ahmed", "rakan")
//
//    //if list is empty datatype must be written "explicit"
//    val numbers = listOf<Int>()
//    val numbers2:List<Int> = listOf()
//
//    //nullable list has ? after the datatype
//    val names2 = mutableListOf<String?>("anas", "khaled", "ahmed")
//
//    //safe accessing
//    val x = names.getOrElse(3){
//        "Index out of range"
//    }
//    println(x)

    //------------------------------MUTABLE LIST *modifiable*------------------------------
    //------Adding---------
//    val numbers = mutableListOf(15, 90, 10)
//
//    //adds an element at the end
//    numbers.add(99)
//
//    //adds an element at a specific index
//    numbers.add(1, 22)
//
//    //-------Updating--------
//    val names2 = mutableListOf("anas", "khaled", "ahmed")
//
//    //there is two ways to update a list
//    names2[1] = "Rakan" //1
//
//    names2.set(1, "RAKAN") //2
//
//    //--------Removing----------
//    val cars = mutableListOf<String>("Car1", "Car2", "Car3")
//
//    //both removes "Car2"
//    //strings are cast sensitive
//    cars.remove("Car2")
//    cars -= "Car2"
//
//    //remove the element at index '1'
//    cars.removeAt(1)
//
//    //---------for each-------------
//    val stations = mutableListOf<String>("water", "food", "juice", "water")
//    stations.forEachIndexed { index, s ->
//        println("The String: $s has index: $index")
//
//        //update
//        stations[index] = "$s station"
//        stations.set(index,"$s stations")
//    }

    //------------------------------*SETS*------------------------------
    //a set can't have duplicated elements
    //sets are not indexed : meanning you can't access element using indexes such: numbers3[index]
//    val car = mutableSetOf<String>() //empty
//    val cars = mutableSetOf("Car1", "Car2", "Car3")//has elements
//
////    ------Adding---------
////    since sets are not index adding wil be at the end only
//    cars.add("Car4")
//    cars += "Car5"
//
////    -------Updating--------
////    in sets there is not updating because there is no indexing
//
////    --------Removing----------
////    removes the element that equals "Car3"
//    cars.remove("Car3")
//
////    will remove nothing because it's case-sensitive
//    cars.remove("Car3")


    //------------------------------*TO-LIST AND TO-SET*------------------------------

////    commonly used to eliminate duplications
    val numbers = mutableListOf(1, 2, 3).toSet().toMutableList()
//
////    a shortcut for the above
    val numbers2 = mutableListOf(1, 2, 3).distinct()

    //------------------------------*MAPS*------------------------------
    // Could be mutableMapOf<>() or mapOf<>()

    //unassigned map
    //Int is the key datatype, String is the element datatype
    val mapOne = mutableMapOf<Int, String>()
//    containing elements
    val mapTwo = mapOf(1 to "Mohammed", 2 to "ahmed")

    val mapExample = mutableMapOf<Int, String>()
//    adding elements to a map
//    in maps we use put()
    mapOne.put(1, "Mohammed")
//    2 - mapName[newKey] = "newElement"
    mapOne[2] = "khaled"

//     printing a specific element by key
    println(mapExample[2]) // 2 is the key value not an index

}

