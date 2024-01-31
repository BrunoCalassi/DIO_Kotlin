class User(val id: Int, val name: String)

/*
 * No Kotlin, a declaração de um objeto (por meio da palavra-chave object)
 * é uma maneira concisa e eficaz de implementar o padrão Singleton.
 */
object UserManager {

    private val users = mutableListOf<User>()
    private var userId = 1

    fun addUser(name: String) {
//        TODO("Implementar a lógica de adicionar um novo usuário na lista mutável $users.")
        val newUser = User(userId, name)
        users.add(newUser)
        userId++

    }

    fun listUsers() {
//        TODO("Implementar a impressão dos $users, seguindo o padrão definido no enunciado.")
        for (user in users){
            println("${user.id} - ${user.name}")
        }
    }
}

fun main() {
    val quantity = readLine()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        val name = readLine() ?: ""
        UserManager.addUser(name)
    }

    UserManager.listUsers()
}