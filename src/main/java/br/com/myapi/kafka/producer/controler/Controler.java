package br.com.myapi.kafka.producer.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.myapi.kafka.producer.service.MenssagemService;

@RestController
@RequestMapping("/kafka")
public class Controler {
	
	@Autowired
	MenssagemService menssagemService;
	
	@PostMapping
	public ResponseEntity<String>  enviandomenssagem(@RequestBody String mensagem){
		menssagemService.sendMessage(mensagem);
		return ResponseEntity.ok().body("Menssagem enviada com sucesso!" + mensagem );
		
	}

}
