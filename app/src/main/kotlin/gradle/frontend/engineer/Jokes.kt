package gradle.frontend.engineer

fun fetchRandomJoke(): String {
    val jokes =
            listOf(
                    "Why do programmers prefer dark mode? Because light attracts bugs!",
                    "Why do Java developers wear glasses? Because they can't C#!",
                    "How do you comfort a JavaScript bug? You console it!",
            )

    return jokes.random()
}

fun printJoke() {
    val joke = fetchRandomJoke()
    println(joke)
}
