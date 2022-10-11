package com.gl.cm.bffpersonas.service;

import com.gl.cm.bffpersonas.dto.PersonaDTO;
import com.gl.cm.bffpersonas.service.client.PersonasClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{
    private final PersonasClient client;

    @Autowired
    public PersonaServiceImpl(PersonasClient client) {
        this.client = client;
    }

    public List<PersonaDTO> getPersonas(){
        return client.getPersonas();
    }

    @Override
    public PersonaDTO getPersona(String id) {
        return client.getPersona(id);
    }

    @Override
    public PersonaDTO savePersona(PersonaDTO personaDTO) {
        return client.save(personaDTO);
    }

    @Override
    public PersonaDTO updatePersona(PersonaDTO personaDTO) {
        return client.update(personaDTO);
    }

    @Override
    public void deletePersona(String id) {
        client.delete(id);
    }
}
