package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var aToUpperCase = a.toUpperCase()
        for (char in b) {
            if (aToUpperCase.contains(char)) {
                aToUpperCase = aToUpperCase.substring(aToUpperCase.indexOf(char) + 1, aToUpperCase.length)
            } else return "NO"
        }
        return "YES"
    }
}
