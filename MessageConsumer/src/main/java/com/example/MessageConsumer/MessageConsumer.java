package com.example.MessageConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageConsumer 
{
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/consume/{param}")
	public Object consume(@PathVariable("param")int param)
	{
		String url="http://localhost:8085/emp/select/"+param;
		//HttpHeaders h = new HttpHeaders();
		//headers
		return (rt.getForEntity(url, String.class));
	}
}
