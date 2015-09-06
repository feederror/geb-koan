package geb.koan

import geb.spock.GebSpec
import grails.test.mixin.integration.Integration

import static geb.koan.Koan.__

@Integration
class _03_CssSelectionSpec extends GebSpec {
    // For help see: http://www.w3schools.com/cssref/css_selectors.asp
    // For fun help see: http://flukeout.github.io/

    def "Geb uses css selectors to find elements on the page"() {
        when:
            go "/css-selection"
        then: "The main heading text is"
            $("h1").text() == "Css Selection"
    }

    def "You can find elements on the page by passing in the element name"() {
        when:
            go "/css-selection"
        then: "The sub heading text is"
            $("h2").text() == "A natural way of extracting html content"
    }

    def "You can also gain access to the elements attributes"() {
        when:
            go "/css-selection"
        then: "The anchors href attribute points to some css selector documentation"
            $("a").@href == "http://www.w3schools.com/cssref/css_selectors.asp"
    }
}