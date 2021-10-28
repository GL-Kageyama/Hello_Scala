object HelloScala2 {
    def main(args: Array[String]): Unit = {
        println(args(0) + " " + args(1))
    }
}

// ===================================
// Output Sample (Compile ver.)
// ===================================
// ~ $ scalac HelloScala2.scala
// ~ $ scala HelloScala2 Hello Scala
// Hello Scala