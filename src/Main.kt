import problem_solving.RichestCustomerWealth

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val accounts = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(3, 2, 1),
        intArrayOf(4, 5, 6)
    )

    val richestCustomerWealth = RichestCustomerWealth()

    val res = richestCustomerWealth.maximumWealth(accounts)


}

