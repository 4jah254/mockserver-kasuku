package personal.zukanori.mockserverkasuku

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import personal.zukanori.models.Message

@RestController
class MessageController {
    @GetMapping("/messages")
    fun index() = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!"),
    )
}
