package problem_solving

class RichestCustomerWealth {

    fun maximumWealth(accounts: Array<IntArray>): Int {

        var result = 0

        for (data in accounts) {

            val sum = data.sum()

            if (result < sum) {
                result = sum
            }

        }

        return result

    }
}