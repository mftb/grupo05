package br.unicamp.ic.mc437.grupo05.controller;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.unicamp.ic.mc437.grupo05.infra.ProdutoDao;
import br.unicamp.ic.mc437.grupo05.modelo.Carrinho;
import br.unicamp.ic.mc437.grupo05.modelo.Item;
import br.unicamp.ic.mc437.grupo05.modelo.Restrito;

@Resource
public class CarrinhoController {

	private final ProdutoDao produtoDao;
	private final Carrinho carrinho;
	private final Result result;

	public CarrinhoController(Carrinho carrinho, ProdutoDao produtoDao, Result result) {
		this.carrinho = carrinho;
		this.produtoDao = produtoDao;
		this.result = result;
	}
	
	@Restrito
	@Post("/carrinho")
	public void adiciona(Item item){
		produtoDao.recarrega(item.getProduto());
		carrinho.adiciona(item);
		result.redirectTo(this).visualiza();
	}
	
	@Restrito
	@Get("/carrinho")
	public void visualiza(){
	}
	
	@Restrito
	@Delete("/carrinho/{indiceItem}")
	public void remove(int indice){
		carrinho.remove(indice);
		result.redirectTo(this).visualiza();
	}
	
}
