package com.optumrx.pams.controller

/** @author vgopi2 */
import com.optumrx.pams.util.CustomResponse
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController {

    @GetMapping("/welcome")
    fun welcome(): ResponseEntity<CustomResponse> {
        var response = CustomResponse("Welcome to Kotlin World!!\uD83D\uDE42")
        return ResponseEntity.status(HttpStatus.OK)
            .contentType(MediaType.APPLICATION_JSON)
            .body(response)
    }
}
