package com.gl.cm.bffpersonas.service.client;

import com.gl.cm.bffpersonas.dto.PersonaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "ms-personas", url = "http://localhost:8080")
public interface PersonasClient {

    @GetMapping(value = "/personas", consumes = "application/json")
    List<PersonaDTO> getPersonas();

    @GetMapping(value = "/personas/{id}", consumes = "application/json")
    PersonaDTO getPersona(@PathVariable("id")String id);

    @PostMapping(value = "/personas", consumes = "application/json")
    PersonaDTO save(@RequestBody PersonaDTO personaDTO);

    @PutMapping(value = "/personas", consumes = "application/json")
    PersonaDTO update(@RequestBody PersonaDTO personaDTO);

    @DeleteMapping(value = "/personas/{id}", consumes = "application/json")
    void delete(@PathVariable("id") String id);

}
