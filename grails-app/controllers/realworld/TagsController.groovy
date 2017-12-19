package realworld

class TagsController {

    def tagsService

	static responseFormats = ['json']
	
    def index() {
        [tagsList:  tagsService.all]
    }
}
