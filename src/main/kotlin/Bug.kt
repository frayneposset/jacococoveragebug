data class House(val line1 : String)
data class Street(val house: House)

class Bug {

    fun mapCheck(key : String): House {
        val map = mapOf("A" to Street(House("10 London Road")))
        val street = map[key]
        return street?.house ?: throw IllegalArgumentException("unknown key $key")
    }
}