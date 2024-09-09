package br.com.srm.apiPagamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srm.apiPagamento.en.StatusPagamentoEnum;
import br.com.srm.apiPagamento.model.Emprestimo;
import br.com.srm.apiPagamento.repositories.EmprestimoRepository;

@Service
public class EmprestimoService {

	@Autowired
	EmprestimoRepository emprestimoRepository;
	
	public void efetuarPagamento(Long id) {
		Emprestimo emprestimo = emprestimoRepository.findById(id).orElse(null);
		if(emprestimo != null) {
			emprestimo.setStatusPagamento(StatusPagamentoEnum.PAGO);
			emprestimoRepository.save(emprestimo);
		}
	}
}
