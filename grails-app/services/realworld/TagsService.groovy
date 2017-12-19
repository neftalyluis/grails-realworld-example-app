package realworld

import grails.gorm.transactions.Transactional

@Transactional
class TagsService {

    def getAll() {
        return Tags.withCriteria {
            projections {
                property('name')
            }
        }
    }
}
