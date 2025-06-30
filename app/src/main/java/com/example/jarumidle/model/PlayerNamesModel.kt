class PlayerNamesModel(
    private var player1: String,
    private var player2: String) {

    fun getPlayer1(): String {
        return player1
    }

    fun getPlayer2(): String {
        return player2
    }

    fun setPlayer1(name: String) {
        player1 = name
    }

    fun setPlayer2(name: String) {
        player2 = name
    }
}
