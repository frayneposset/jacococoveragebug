import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class BugTest {
    val bug = Bug()

    @Test
    fun `get key works`() {
        bug.mapCheck("A").line1 shouldBe "10 London Road"
    }

    @Test
    fun `get key throws exception`() {
        shouldThrow<IllegalArgumentException>{
            bug.mapCheck("B")}.message shouldBe "unknown key B"
    }
}