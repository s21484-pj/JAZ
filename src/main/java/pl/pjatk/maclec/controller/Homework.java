package pl.pjatk.maclec.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.maclec.model.Car;

@RestController
@RequestMapping("/homework")
public class Homework {

    @GetMapping("/pathVariable/{str}")
    public ResponseEntity<String> getPathVariable(@PathVariable String str) {
        return ResponseEntity.ok(str);
    }

    @GetMapping("/requestParam")
    public ResponseEntity<String> getRequestParam(@RequestParam String str) {
        return ResponseEntity.ok(str);
    }

    @PutMapping("/put/{str}")
    public ResponseEntity<Car> putCar(@PathVariable String str, @RequestBody Car car) {
        if (!str.equals("null")) {
            return ResponseEntity.ok(car);
        } else {
            return ResponseEntity.ok(new Car("null", 0));
        }
    }

    @PostMapping("/requestBody")
    public ResponseEntity<String> postRequestBody(@RequestBody String str) {
        return ResponseEntity.ok("Hello from postRequestBody " + str);
    }

    @DeleteMapping("/delete/pathVariable/{mark}")
    public ResponseEntity<HttpStatus> deleteCar(@PathVariable String mark) {

        Car car = new Car("Mazda", 2011);

        if (mark.equals(car.getMark())) {
            car = null;
            return ResponseEntity.ok(HttpStatus.OK);
        } else {
            return ResponseEntity.ok(HttpStatus.NOT_FOUND);
        }
    }
}
