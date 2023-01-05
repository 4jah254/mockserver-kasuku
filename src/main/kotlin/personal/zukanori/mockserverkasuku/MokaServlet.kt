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
        var responseWriter: PrintWriter
        responseWriter = response.getWriter()
//        with(responseWriter) {
//            this.conte
//        }
        responseWriter.print("Mango juice")
        responseWriter.flush()
    }
}
