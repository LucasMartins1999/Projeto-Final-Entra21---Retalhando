package br.com.entra21.retalhando.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.entra21.retalhando.models.Empresa;
import br.com.entra21.retalhando.repository.EmpresaRepository;

@Controller
public class InstituicaoController {

	// CADASTRO DE EMPRESA

	@RequestMapping("/cadastro/empresa")
	public String cadastrarEmpresa() {
		return "instituicao/cadastrarEmpresa";
	}
	
	@RequestMapping("/cadastro/Ong")
	public String cadastrarOng() {
		return "instituicao/cadastrarOng";
	}
	@RequestMapping("/cadastro/Retalho")
	public String cadastrarRetalho() {
		return "instituicao/cadastrarRetalho";
	}
	@RequestMapping("/perfil/Empresa")
	public String perfilEmpresa() {
		return "instituicao/perfilEmpresa";
	
	}
	@RequestMapping("/descricao/Retalho")
	public String descricaoRetalho() {
		return "instituicao/descricaoRetalho";
	
	}
}	