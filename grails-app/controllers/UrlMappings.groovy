class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/css-selection"(view:"/css-selection")
        "/browser-driving"(view:"/browser-driving")

        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
