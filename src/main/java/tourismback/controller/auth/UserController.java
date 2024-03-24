package tourismback.controller.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tourismback.service.auth.UsersService;

import java.io.IOException;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {

    private final UsersService usersService;

    @PostMapping("/upload/{id}")
    public ResponseEntity<HttpStatus> uploadImage(@RequestParam("image") MultipartFile image, @PathVariable Long id) throws IOException {
        usersService.saveAvatar(image, id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> getAvatar(@PathVariable Long id) {
        byte[] image = usersService.getImageByUserId(id);
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(image);
    }
}
