import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import personal.zukanori.models.BooksDto

@RestController
@RequestMapping("/books/size")
class BooksInfoController {

    @GetMapping("/{id}", produces = ["application/json"])
    fun getBook(@PathVariable id: Int): BooksDto {
        return findBookById(id)
    }

    private fun findBookById(id: Int): BooksDto {
        return BooksDto("A5", 70, "70 GSM")
    }
}
