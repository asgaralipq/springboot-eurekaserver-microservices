package com.example.clientservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client1-provider")
public class Controller {

    @GetMapping("/client1/{value}")
	public String client1(@PathVariable int value) {
		return "client 1 has returned" + value + " sucessfully";
	}
}
