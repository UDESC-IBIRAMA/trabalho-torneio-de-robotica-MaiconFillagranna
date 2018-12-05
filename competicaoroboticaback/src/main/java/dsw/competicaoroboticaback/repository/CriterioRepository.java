/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsw.competicaoroboticaback.repository;

import dsw.competicaoroboticaback.entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Maicon
 */
public interface CriterioRepository extends JpaRepository<Equipe, Long> {
    
}
