/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsw.competicaoroboticaback.resource;

import dsw.competicaoroboticaback.repository.EquipeRepository;
import dsw.competicaoroboticaback.entity.Equipe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Maicon
 */
@RestController
@RequestMapping("/equipes")
public class AlternativaResource {
    
    @Autowired
    private EquipeRepository equipes;
    
    @PostMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public Equipe save(@RequestBody Equipe equipe) {
        return equipes.save(equipe);
    }
    
    @GetMapping
    private List<Equipe> list() {
        return equipes.findAll();
    }
}
