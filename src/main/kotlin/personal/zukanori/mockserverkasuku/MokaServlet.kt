package personal.zukanori.mockserverkasuku

import java.io.PrintWriter
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(
    name = "MokaServlet",
    urlPatterns = ["/mokaServlet"],
    value = ["/mokaServlet"]
)
class MokaServlet : HttpServlet() {

    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        var responseWriter: PrintWriter = response.getWriter()
        response.contentType = "text/html"
        with(responseWriter) {
            this.println("Mango juice")
            this.flush()
        }
    }
}
