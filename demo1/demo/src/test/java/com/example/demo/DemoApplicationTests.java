package com.example.demo;


import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.controller.DemoController;

@RunWith(SpringRunner.class)
@WebMvcTest(DemoController.class)
public class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
		
	@Test
	public void contextLoads() throws Exception {
		
		mockMvc.perform(get("/hello")
			      .contentType(MediaType.APPLICATION_JSON))
				  .andDo(print())
			      .andExpect(status().isOk())
			      .andExpect(content().string(containsString("Hello World")));
		  
		 
				
		}

}
