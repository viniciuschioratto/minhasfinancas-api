package com.chioratto.minhasfinancas.service;

import java.util.List;

import com.chioratto.minhasfinancas.model.entity.Lancamentos;
import com.chioratto.minhasfinancas.model.enums.StatusLancamento;

public interface LancamentoService {
	
	Lancamentos salvar(Lancamentos lancamentos);
	
	Lancamentos atualizar(Lancamentos lancamentos);
	
	void deletar(Lancamentos lancamentos);
	
	List<Lancamentos> buscar(Lancamentos lancamentos);
	
	void atualizarStatus(Lancamentos lancamentos,StatusLancamento status);
	
	void validar(Lancamentos lancamentos);
}
