package com.chioratto.minhasfinancas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chioratto.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	//Este metodo ira buscar no Banco pelo e-mail passado
	//O nome "findByEmail" significa que devera buscar pelo campo "email"
	//Optional<Usuario> findByEmail(String email);
	
	boolean existsByEmail(String email);
	
	Optional<Usuario> findByEmail(String email);

}
