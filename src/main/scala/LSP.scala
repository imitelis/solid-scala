// Liskov Substitution Principle (LSP)

class Engine {
    private var _power: Integer = ???

    def on(): Unit = println("Engine on")
    def powerOn(power: Integer): Unit = this._power = power
}

// Not following LSP
class Car {
    def turnOnEngine(): Unit = println("Car on")
    def accelerate(): Unit = println("Car accelerating")
}

class MotorCar extends Car {
    private var _engine: Engine = ???

    //Constructors, getters + setters

    override def turnOnEngine(): Unit = {
        //turn on the engine!
        _engine.on();
    }

    override def accelerate(): Unit = {
        //move forward!
        _engine.powerOn(1000);
    }
}

class ElectricCar extends Car {
    override def turnOnEngine(): Unit = {
        throw new AssertionError("I don't have an engine!");
    }

    override def accelerate(): Unit = {
        //this acceleration is crazy!
        println("Electric Car accelerating")
    }
}

// Following LSP
class NewCar {
    def accelerate(): Unit = println("Car accelerating")
}

class NewMotorCar extends NewCar {
    private var _engine: Engine = ???

    //Constructors, getters + setters

    def turnOnEngine(): Unit = {
        //turn on the engine!
        _engine.on();
    }

    override def accelerate(): Unit = {
        //move forward!
        _engine.powerOn(1000);
    }
}

class NewElectricCar extends NewCar {
    override def accelerate(): Unit = {
        //this acceleration is crazy!
        println("Electric Car accelerating")
    }
}