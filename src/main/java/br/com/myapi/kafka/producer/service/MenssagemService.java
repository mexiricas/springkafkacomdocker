package br.com.myapi.kafka.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class MenssagemService {
	private static final Logger logger	= LoggerFactory.getLogger(MenssagemService.class);
	
	
	@Value("topic.bora-pratica")
	private String topicbp;
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate ;
	
	public void sendMessage(String message) {
		
		logger.info("Menssagem -> {}", message);
		this.kafkaTemplate.send(topicbp, message);
	}
	

}
