package com.github.avenderov

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldHaveLength

class ExampleTest : DescribeSpec({

    describe("top level test") {
        it("should pass") {
            val s = "test"
            s.shouldHaveLength(4)
        }

        describe("second level test") {
            it("2 + 2 = 4") {
                (2 + 2).shouldBe(4)
            }

            describe("third level test") {
                it("2 * 2 = 4") {
                    (2 * 2).shouldBe(4)
                }
            }
        }
    }
})
