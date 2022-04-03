class Songs(val title: String, artists_param: String) {
    val artists = artists_param
    var weigth:Double=0.0
    get() = field
    set(value) {
        field=value
    }


    fun play() {
        println("Playng the song $title by $artists")
    }

    fun stop() {
        println("Stopped plaiyng $title")
    }

    init {
        println("initia es")
    }
}

fun main() {
    val songOne = Songs("vincxa vincxiani", "chichiko")
    songOne.play()
    songOne.stop()

    songOne.weigth=33.0
}


