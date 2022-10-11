package com.gl.cm.bffpersonas.controller;

import com.gl.cm.bffpersonas.dto.PersonaDTO;
import com.gl.cm.bffpersonas.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bffpersonas")
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping()
    public ResponseEntity<List<PersonaDTO>> getPersonas() {
        return new ResponseEntity<>(personaService.getPersonas(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonaDTO> getPersona(@PathVariable("id") String id) {
        return new ResponseEntity<>(personaService.getPersona(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<PersonaDTO> savePersona(@RequestBody PersonaDTO personaDTO) {
        return new ResponseEntity<>(personaService.savePersona(personaDTO), HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<PersonaDTO> updatePersona(@RequestBody PersonaDTO personaDTO) {
        return new ResponseEntity<>(personaService.updatePersona(personaDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable("id") String id) {
        personaService.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
