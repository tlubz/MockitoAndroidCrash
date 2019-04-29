package com.example.mockitoandroidcrash

import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito.mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    open class Example

    @Test
    fun `uses default SubclassByteBuddyMockMaker for mocking`() {
        val exampleMock = mock(Example::class.java)
        assertTrue(exampleMock is Example)
    }
}
