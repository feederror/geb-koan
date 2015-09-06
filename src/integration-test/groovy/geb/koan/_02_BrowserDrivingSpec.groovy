package geb.koan

import geb.spock.GebSpec
import grails.test.mixin.integration.Integration
import grails.transaction.Rollback

import static CashRegister.sellItemsAndReturnTotal
import static geb.koan.Koan.__

@Integration
class _02_BrowserDrivingSpec extends GebSpec {

    def "Geb drives the browser to web pages you want to test"() {
        when: "I go to the home page"
            go "/"
        then: "I check the page title using Geb's built in title method"
            title == "Geb Koans"
    }

    def "You can go to any page by passing in the URL path"() {
        when: "I go to the /browser-driving page"
            go "/browser-driving"
        then:
            title == "Browser Driving"
    }
}