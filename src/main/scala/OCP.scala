// Open/Closed Principle (OCP)

class Guitar {
    private var _make: String = ???
    private var _model: String = ???
    private var _volume: Integer = ???

    //Constructors, getters & setters
}

// Not following OCP
class BadGuitar {
    private var _make: String = ???
    private var _model: String = ???
    private var _volum: Integer = ???
    private var _flameColor: String = ???

    //Constructors, getters & setters
}

// Following OCP
class FlamedGuitar extends Guitar {
    private var _flameColor: String = ???

    //constructor, getters + setters
}