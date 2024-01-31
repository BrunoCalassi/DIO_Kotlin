fun main() {
    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var resultado: Int

    while (true) {
        print("Digite um número romano (ou 'sair' para encerrar): ")
        val entrada: String? = readLine()?.uppercase()

        if (entrada == "SAIR") {
            println("Encerrando o programa.")
            break
        }

        resultado = converterNumeroRomano(entrada, numerosRomanos)

        println("O número romano $entrada é equivalente a $resultado.\n")
    }
}

fun converterNumeroRomano(numeroRomano: String?, numerosRomanos: Map<Char, Int>): Int {
    if (numeroRomano == null) {
        println("Entrada inválida.")
        return 0
    }

    var resultado = 0
    for (i in numeroRomano.indices) {
        val atual = numerosRomanos.getOrElse(numeroRomano[i]) {
            println("Caractere '${numeroRomano[i]}' não reconhecido como número romano.")
            return 0
        }

        val proximo = when {
            i + 1 < numeroRomano.length -> numerosRomanos.getOrElse(numeroRomano[i + 1]) { 0 }
            else -> 0
        }

        if (atual < proximo) {
            resultado -= atual
        } else {
            resultado += atual
        }
    }

    return resultado
}
