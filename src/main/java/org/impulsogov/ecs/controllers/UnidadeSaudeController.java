package org.impulsogov.ecs.controllers;

import org.impulsogov.ecs.models.UnidadeSaude;
import org.impulsogov.ecs.services.UnidadeSaudeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnidadeSaudeController {

    @Autowired
    private UnidadeSaudeService service;

    @GetMapping ("/unidade-saude")
    public List<UnidadeSaude> unidadeSaude() {
        return service.loadAll();
    }

    @PostMapping("/unidade-saude")
    public UnidadeSaude newUnidadeSaude(@RequestBody UnidadeSaude unidadeSaude) {
        return service.save(unidadeSaude);
    }

}
