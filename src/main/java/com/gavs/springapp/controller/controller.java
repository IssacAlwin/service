package com.gavs.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.gavs.springapp.repo.Serv;

@RestController

public class controller {
	
	@Autowired
     Serv obj;

	@GetMapping("/bubblesort")
	public int[] run(@RequestBody int[] arr) {
	obj.bubbleSort(arr);
	return arr;
	
	}
	
	

}
