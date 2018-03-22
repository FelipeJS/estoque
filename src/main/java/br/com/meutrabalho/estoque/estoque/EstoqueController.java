package br.com.meutrabalho.estoque.estoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstoqueController {

	@Autowired
	private EstoqueService estoqueService;

	@RequestMapping("estoque/home")
	public String home(Model model) {

		Iterable<Estoque> estoques = estoqueService.findAll();
		model.addAttribute("estoques", estoques);

		return "estoque/home";
	}
}