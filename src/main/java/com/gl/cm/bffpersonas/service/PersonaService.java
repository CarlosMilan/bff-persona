package com.gl.cm.bffpersonas.service;

import com.gl.cm.bffpersonas.dto.PersonaDTO;

import java.util.List;

public interface PersonaService {
    List<PersonaDTO> getPersonas();
    PersonaDTO getPersona(String id);
    PersonaDTO savePersona(PersonaDTO personaDTO);
    PersonaDTO updatePersona(PersonaDTO personaDTO);
    void deletePersona(String id);
}
