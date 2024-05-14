// Single Responsability Principle (SRP)

class Book {
    private var _name: String = ???
    private var _author: String = ???
    private var _text: String = ???

    //constructor, getters and setters

    // methods that directly relate to the book properties
    def replaceWordInText(word: String, replacementWord: String): String = {
        return this._text.replaceAll(word, replacementWord);
    }

    def isWordInText(word: String): Boolean = {
        return _text.contains(word);
    }
}

// Not following SRP
class BadBook {
    private var _name: String = ???
    private var _author: String = ???
    private var _text: String = ???

    //constructor, getters and setters

    // methods that directly relate to the book properties
    def replaceWordInText(word: String, replacementWord: String): String = {
        return this._text.replaceAll(word, replacementWord);
    }

    def isWordInText(word: String): Boolean = {
        return _text.contains(word);
    }

    def printTextToConsole(): Unit = {
        // our code for formatting and printing the text
        println(_text)
    }
}

// Following SRP
class BookPrinter {
    // methods for outputting text
    def printTextToConsole(text: String): Unit = {
        // our code for formatting and printing the text
        println(text)
    }

    def printTextToAnotherMedium(text: String): Unit = {
        // code for writing to any other location..
        ???
    }
}