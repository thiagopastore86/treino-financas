package com.pastore.financas.model.repositories;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pastore.financas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	//Optional<Usuario> findByEmail(String email); ou usar o abaixo
	
	boolean existsByEmail(String email);

}
