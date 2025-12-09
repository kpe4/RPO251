package lesson7

class Player(
    val name: String
){
    val inventory = Inventory()
}

// точка входа в программу - без нее не будет посылаться команда запуска компилятору и все реализ вами классы
// и функции не будут нигде работать и задействоваться
fun main(){
    val player = Player(
        "Oleh"
    )

    val sword = Item(
        1,
        "S1mple sword",
        "nenadezhniy",
        30,
        15
    )

    val potion = Item(
        2,
        "Heal potion",
        "heling player by 15hp",
        35,
        3
    )

    val oreshnik = Item(
        3,
        "Oreshnik",
        "Bomba kotoraya stiraet all",
        2080,
        290
    )

    player.inventory.addItem(sword)
    player.inventory.addItem(potion)
    // добав неск предм в инвентарь играка
    // после выводим содерж инвент
    player.inventory.printInventory()

    player.inventory.removeItem(potion)
    // удаляем пару предм из инвентаря и выводим содерж инвент
    player.inventory.printInventory()
    // добавляем тяжелый предм
    player.inventory.addItem(oreshnik)
    player.inventory.printInventory()

    val foundByName = player.inventory.findItemByName("S1mple sword")
    if (foundByName != null){
        println("Found by name. Name: ${foundByName.name}. Desc: ${foundByName.description}.")
    }else{
        println("Item name not found or does not exist")
    }
    val foundById = player.inventory.findItemById(1)
    if (foundById != null){
        println("Found by id. Name: ${foundById.name}. Desc: ${foundById.description}")
    }else{
        println("Item id not found or does not exist")
    }
}