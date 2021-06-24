package com.pastore.financas.model.repositories;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.pastore.financas.model.entity.Usuario;


@SpringBootTest
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class UsuarioRepositoryTest { 
	
	@Autowired
	UsuarioRepository repositorio;
	
	@Test
	public void deveVerificarExistenciaEmail() {
		
		//cenario
		Usuario usu = Usuario.builder().nome("thiago").email("th@com").senha("123").build();
		repositorio.save(usu);
		
		//ação/execução
		boolean resultado = repositorio.existsByEmail("th@com");
		
		//verificação
		Assertions.assertThat(resultado).isTrue();
	}
	
	@Test
	public void retornaFalseQuandoNaoAchaUsuarioComEmail() {
		
		//cenario
		repositorio.deleteAll();
		
		//ação/execução
		boolean resultado = repositorio.existsByEmail("th@com");
		
		//verificação
		Assertions.assertThat(resultado).isFalse();
	}
	
	

}
