package pe.edu.utec.dbp.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.utec.dbp.service.UserService;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public ResponseEntity<ResponseDTO> create(
            @Valid @RequestBody RequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.create(dto));
    }
}

@GetMapping("/{id}")
public ResponseEntity<ResponseDTO> get(@PathVariable Long id) {
    return ResponseEntity.ok(service.get(id));
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
}