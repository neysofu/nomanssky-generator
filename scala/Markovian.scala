import scalaz.State

trait Markovian[T] extends State[Seq[T], T] {

    def next(start: Seq[T]): T =
        chain(seq.length).getOrElse(seq, next(seq.tail))
}
