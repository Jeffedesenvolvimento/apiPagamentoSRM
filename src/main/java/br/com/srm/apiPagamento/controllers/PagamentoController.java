package br.com.srm.apiPagamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.srm.apiPagamento.services.EmprestimoService;

@Controller
@RequestMapping("/pagamento")
public class PagamentoController {

	@Autowired
	private EmprestimoService emprestimoService;
	
	@PostMapping("")
	@ResponseBody
	public String criarEmprestimo(@RequestParam Long idEmprestimo) {
		this.emprestimoService.efetuarPagamento(idEmprestimo);
		return "Pagamento efetuado";
	}
}
