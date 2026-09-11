package com.JPA.JPA.repository;

import com.JPA.JPA.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository /*Maperamos con repositorio la interface extiende de JpaRepository
(que maneja repositorios JPA) en los parametros <> deber ir: <clase a persistir, tipo de datos de su id>
*/
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
}
