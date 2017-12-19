package realworld

class BootStrap {

    def init = { servletContext ->
        def tag1 = new Tags(name: "TEST1").save()
        def tag2 = new Tags(name: "TEST122").save()

    }
    def destroy = {
    }
}
