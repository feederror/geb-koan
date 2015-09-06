package geb.koan

import geb.spock.GebSpec
import grails.test.mixin.integration.Integration
import spock.lang.Ignore

import static geb.koan.Koan.__
import static CashRegister.sellItemsAndReturnTotal

@Integration
class _01_SpockSpec extends GebSpec {
    // For help see: http://spockframework.github.io/spock/docs/1.0/index.html

    def "Testing is as easy as 1 2 3"() {
        when:
            def result = 1 + 2
        then:
            result == 3
    }

    def "You can compare anything"() {
        when:
            def result = 5
        then:
            6 > result
    }

    def "as long as the truth is returned"() {
        when:
            def truth = [].empty
        then:
            truth
    }

    def "Some things can be given before hand"() {
        given:
            def two = 2
        when:
            def result = 1 < two
        then:
            result
    }

    def "Which lets us describe what is happening in natural language"() {
        given: "I have two apples"
            def apple1 = new Apple(variety: "Golden Delicious", colour: "Yellow", priceInCents: 66)
            def apple2 = new Apple(variety: "Granny Smith", colour: "Green", priceInCents: 72)
        when: "I sell them both"
            def total = sellItemsAndReturnTotal([apple1, apple2])
        then: "I will have made"
            total == 138
    }

    def "Setup lets us use things in multiple tests"() {
        when:
            def isRipe = apple3.colour == "Red"
        then:
            isRipe
    }

    def "So that we don't have to redefine them for every test"() {
        when: "I sell two pink ladies"
            def total = sellItemsAndReturnTotal([apple3, apple3])
        then: "I make twice the amount"
            total == 2 * apple3.priceInCents
    }

    def "cleanup lets us clean up state we may have left behind from other tests"() {
        when: "I sell apples"
            sellItemsAndReturnTotal([apple3])
        then: "I want to keep track of how many I have sold"
            CashRegister.numberOfItemsSold == 1
    }

    def "the 'and:' label does the same thing as the previous label"() {
        when:
            def stringLength = "abc".length()
        then:
            stringLength > 2
        and:
            stringLength < 4
    }

    @Ignore
    def "some tests will always fail and can be ignored with an annotation"() {
        when:
            def result = "five".toInteger()
        then:
            result == 5
    }

    Apple apple3

    def setup() {
        apple3 = new Apple(variety: "Pink Lady", colour: "Red", priceInCents: 76)
    }

    def cleanup() {
        CashRegister.numberOfItemsSold = 0
    }
}
