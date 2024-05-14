// Interface Segregation Principle (ISP)

// Not following ISP
trait BearKeeper {
    def washTheBear(): Unit = println("Washing the bear")
    def feedTheBear(): Unit = println("Feeding the bear")
    def petTheBear(): Unit = println("Petting the bear")
}

// Following ISP
trait BearCleaner {
    def washTheBear(): Unit = println("Washing the bear")
}

trait BearFeeder {
    def feedTheBear(): Unit = println("Feeding the bear")
}

trait BearPetter {
    def petTheBear(): Unit = println("Petting the bear")
}

class BearCarer extends BearCleaner, BearFeeder {
    override def washTheBear(): Unit = {
        //I think we missed a spot...
        ???
    }

    override def feedTheBear(): Unit = {
        //Tuna Tuesdays...
        ???
    }
}

class CrazyPerson extends BearPetter {
    override def petTheBear(): Unit = {
        //Good luck with that!
        ???
    }
}