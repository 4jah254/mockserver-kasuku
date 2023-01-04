package personal.zukanori.mockserverkasuku

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import personal.zukanori.models.BooksDto

@RestController
class BooksInfoController {

    @GetMapping("/books/samples")
    fun books() = listOf<BooksDto>(
        BooksDto("A5", 70, "70 GSM"),
        BooksDto("B5", 120, "70 GSM"),
    )

    @GetMapping("/books/{id}")
    fun getBook(@PathVariable id: Int): BooksDto {
        return findBookById(id)
    }

    private fun findBookById(id: Int): BooksDto {
        return BooksDto("A5", 70, "70 GSM")
    }
}
