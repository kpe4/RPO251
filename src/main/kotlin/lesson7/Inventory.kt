package lesson7

class Inventory{
    // ( ... ) - в круглый скоб у нас первичный конструктор
    // { ... } - в фигурных скобках вторичный
    // разница в том что первичн конструктор надо задать при объявлении объекта класса

    val items: MutableList<Item> = mutableListOf()

    fun addItem(item: Item){
        items.add(item)
        // .add метод списка который добавляет в конец списка объект

        println("Added ${item.name}")
    }

    fun removeItem(item: Item): Boolean{
        // : Boolean - то что будет возвращать метод после выполнения (return)
        val removed = items.remove(item)
        // .remove - удаляет одирн элем из списка по предм по списку который мы ищем (item)
        if (removed){
            println("Removed ${item.name}")
        }else{
            println("This item does not exist")
        }

        return removed // внутри removed после удаления сохранится либо true либо false
    }

    fun printInventory(){
        println("=== Inventory ===")
        for (item in items){
            // item - переменная которая будет каждую итерацию цикла хранить в себе 1 элемент списка
            // пока не переберутся все элементы этого списка
            if (items.isEmpty()){
                // isEmpty - вернет true если  в списке нет эелем
                println("Inventory is empty")
                return // точка выхода из printInventory - то есть код ниже не пойдет
            }

            println("- ${item.name} | Price: ${item.price} | Description: ${item.description}")
        }
    }
}