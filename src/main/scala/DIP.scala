// Dependency Inversion Principle (DIP)

// Not following DIP
class TerribleWindows98Machine{
    class Keyboard
    class Monitor
    
    private var keyboard = new Keyboard
    private var monitor = new Monitor

    def Windows98Machine(keyboard: Keyboard, monitor: Monitor): Unit = {
        this.keyboard = keyboard
        this.monitor = monitor
    }
}

// Following DIP
class Keyboard
class Monitor
    
class Windows98Machine{
    private var keyboard = new Keyboard
    private var monitor = new Monitor

    def Windows98Machine(keyboard: Keyboard, monitor: Monitor): Unit = {
        this.keyboard = keyboard
        this.monitor = monitor
    }
}

class StandardKeyboard extends Keyboard