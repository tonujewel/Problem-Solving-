package problem_solving


class NumberOfSteps {

    fun numberOfSteps(num: Int): Int {
        var result = 0

        var currentNumber = num

        while (currentNumber > 0) {
            if (currentNumber % 2 == 0) {
                currentNumber = currentNumber / 2
            } else {
                currentNumber = currentNumber - 1
            }
            result++
        }
        return result
    }

}