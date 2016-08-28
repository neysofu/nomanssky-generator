
trait Textbook {

    val text: String
    val alphabet: Set[Char]

    def toDictionary: Set[String] =
        text.split(' ').filter(_.forall(alphabet contains _)).toSet

    def markovChain: Map[String, Char]
}


case class NameGenerator(text: String) extends Textbook {

    val alphabet: Set[Char] =
        (('a' to 'z') ++ ('A' to 'Z') ++ " ").toSet

    def markovChain: State[String, Char] = {
        var chain: Map[String]
    }
        toDictionary.map()
}
