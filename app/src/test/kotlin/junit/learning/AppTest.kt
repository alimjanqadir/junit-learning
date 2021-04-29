package junit.learning

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AppTest {
    @Test
    fun testGreeting() {
        val classUnderTest = App()
        assertEquals("Hello World!", classUnderTest.greeting)
    }
}