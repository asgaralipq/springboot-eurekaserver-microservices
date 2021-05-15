package com.example.clientservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller2 {
    @Autowired
	private RestTemplate template;

	@GetMapping("/client2/{value}")
	public String invokeClient1(@PathVariable int value) {
		String url = "http://CLIENT1-SERVICE/client1-provider/client1/" + value;
		return template.getForObject(url, String.class);
	}
}
