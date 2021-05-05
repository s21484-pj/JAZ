package pl.pjatk.maclec.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.maclec.model.Car;

@RestController
public class Controller {

    @GetMapping("/test/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/test/model")
    public ResponseEntity<Car> getCar() {
        return ResponseEntity.ok(new Car("Audi", 2010));
    }

    @GetMapping("/test/hello/{someValue}")
    public ResponseEntity<String> someValue(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/test/hello/req")
    public ResponseEntity<String> getRequestParam(@RequestParam String request) {
        return ResponseEntity.ok(request);
    }

    @PostMapping("/test/model")
    public ResponseEntity<Car> postCar(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }
}
