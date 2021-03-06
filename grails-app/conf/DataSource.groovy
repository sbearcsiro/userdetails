dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    username = ""
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
    hibernate.show_sql = false
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "none"
            url = "jdbc:mysql://localhost/emmet"
            username = "root"
            password = "password"
        }
    }
    production {
        dataSource {
            dbCreate = "none"
        }
    }
}