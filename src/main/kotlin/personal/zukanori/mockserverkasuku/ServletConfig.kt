package personal.zukanori.mockserverkasuku

import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ServletConfig {

//    @Bean
//    fun exampleServletBean(): ServletRegistrationBean<*>? {
//        val bean: ServletRegistrationBean<*> = ServletRegistrationBean<Any?>(
//            CustomServlet(), "/exampleServlet/*"
//        )
//        bean.setLoadOnStartup(1)
//        return bean
//    }

    @Bean
    fun servletBean(): ServletRegistrationBean<MokaServlet> {
        val list = arrayOf ("/mokaServlet",)
        val bean: ServletRegistrationBean<MokaServlet> = ServletRegistrationBean(MokaServlet(), *list)
        bean.setLoadOnStartup(1)
        return bean
    }
}