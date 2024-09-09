package br.com.srm.apiPagamento.model;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.srm.apiPagamento.en.StatusPagamentoEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Emprestimo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private Double valorEmprestimo;	
	
	private Integer parcelas;	
	
	private StatusPagamentoEnum statusPagamento;
	
	private LocalDate dtCriacao;

	private LocalDate dtPagamento;
	
	private Integer diasEmAtraso;
	
	private Double valorParcela;
}
