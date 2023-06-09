package gunam.solaris.controllers;

import gunam.solaris.entities.Division;
import gunam.solaris.services.DivisionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/division")
public class DivisionController {
    private final DivisionService divisionService;

    @CrossOrigin
    @PostMapping("/add")
    ResponseEntity<?> addDivision(@RequestBody Division division) {
        return divisionService.addDivision(division);
    }

    @CrossOrigin
    @GetMapping("/getAll")
    ResponseEntity<?> findAllDivisions() {
        return divisionService.findAllDivisions();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findDivisionById(@PathVariable("id") int id) {
        return divisionService.findDivisionById(id);
    }

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    ResponseEntity<?> deleteDivision(@PathVariable("id") int id) {
        return divisionService.deleteDivision(id);
    }




}
