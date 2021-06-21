package com.pastore.financas.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pastore.financas.exceptions.RegraNegocioException;
import com.pastore.financas.model.entity.Usuario;
import com.pastore.financas.model.repositories.UsuarioRepository;
import com.pastore.financas.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRepository repositorio;

	@Autowired
	public UsuarioServiceImpl(UsuarioRepository repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		
		if (repositorio.existsByEmail(email)) {
			throw new RegraNegocioException("Esse e-mail já se encontra cadastrado!");
		}
		
	}

}
