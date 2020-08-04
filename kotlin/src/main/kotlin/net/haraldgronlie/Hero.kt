package net.haraldgronlie

enum class Alignment {
    GOOD, EVIL, NEUTRAL
}

class Hero {
    var name: String = ""
    var alignment: Alignment = Alignment.NEUTRAL
}
