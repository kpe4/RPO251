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
        30
    )

    val potion = Item(
        2,
        "Heal potion",
        "heling player by 15hp",
        35
    )

    player.inventory.addItem(sword)
    player.inventory.addItem(potion)
    // добав неск предм в инвентарь играка
    // после выводим содерж инвент
    player.inventory.printInventory()

    player.inventory.removeItem(potion)
    player.inventory.addItem(sword)
    // удаляем пару предм из инвенторя и выводим содерж инвент
    player.inventory.printInventory()
}