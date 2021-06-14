package Khozex.ImcAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Khozex.ImcAPI.Model.IMC;

@RestController
@RequestMapping("/teste")
public class IMCController {
	@GetMapping
	public String calcular(@RequestBody IMC imc) {
		imc.getAltura();
		imc.getPeso();
		return imc.exibirIMC();
	}
}
