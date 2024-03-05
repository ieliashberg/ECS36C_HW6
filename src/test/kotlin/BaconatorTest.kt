import edu.ucdavis.cs.ecs36c.Baconator
import org.junit.jupiter.api.Test

class BaconatorTest {

    @Test
    fun executeBasicTest() {
        val b = Baconator("moviedata.csv")
        /*
         * This is FAR from comprehensive on the testing...
         * But it will check that you have the format right
         */
        val testpath = b.getBaconpath("Neil Fingleton")

        assert(testpath.size == 3)
        assert(testpath[0] == "Neil Fingleton")
        assert(testpath[1] == "X-Men: First Class")
        assert(testpath[2] == "Kevin Bacon")
        println("$testpath")
    }
    @Test
    fun testCornerCases() {
        val b = Baconator("moviedata.csv")
        val testpath = b.getBaconpath("Kevin Bacon")
        assert(testpath.size == 1)
        println("$testpath")
    }
}