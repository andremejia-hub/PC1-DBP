package pe.edu.utec.dbp.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
public class CampusEventController {
    private final CampusEventService campuseventService;
    @PostMapping
    public ResponseEntity<ResponseDTO> create (
            @Valid @RequestBody RequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(campuseventService.create(dto));
    }
}
