// this hack is used to ensure that itarator will be resolved first
@CompileTimeCalculation internal class IntProgressionIterator(first: Int, last: Int, val step: Int) : IntIterator()

const val range = (1..10).<!EVALUATED: `1`!>first<!>

@CompileTimeCalculation
fun getIterator(first: Int, last: Int): Int {
    val iterator = (first..last).iterator()
    iterator.nextInt()
    iterator.nextInt()
    iterator.nextInt()
    return iterator.nextInt()
}
const val testIterator = <!EVALUATED: `4`!>getIterator(1, 10)<!>
