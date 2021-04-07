package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Smartphone Xiaomi Redmi Note 8");
		pedido.setUrlDaImagem("https://images-na.ssl-images-amazon.com/images/I/516VWzwFKJL._AC_SL1000_.jpg");
		pedido.setUrlDoProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Note-Camera/dp/B07Z5BBG56");
		pedido.setDescricao("Câmera Selfie 13MP"
				+ "Memória Interna 64GB\r\n"
				+ "Memória Ram 4GB\r\n"
				+ "Sistema operacional Android 9.0");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
	
}
