package realworld

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ArticlesSpec extends Specification implements DomainUnitTest<Articles> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
