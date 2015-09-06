class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/css-selection"(view:"/css-selection")

        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
