fun main() {
    val titulo = readLine() ?: ""
    val autor = readLine() ?: ""

    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()

    println("Slug gerado para o livro:")

//    TODO("Formatar/Imprimir as slugs considerando o padrão de saída deste desafio.")
    println("${slugTitulo}_${slugAutor}")
}

fun String.generateSlug(): String {
//    TODO("Lógica para que qualquer String tenha a capacidade de gerar uma slug (seguindo-este-padrao).")
    return this.replace(Regex("[^A-Za-z0-9 ]"), "").replace(" ","-").lowercase()
}