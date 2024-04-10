package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IShopperConsumer;

@RestController
@RequestMapping("/shop/api")
public class ShopperController {

	@Autowired
	private IShopperConsumer client;
	
	
	@GetMapping("/purchase")
	public ResponseEntity<String> doBilling(){
		System.out.println("ShopperController.display()"+ client.getClass());
		String bilDetails=client.fetchshowBillDetails().getBody();
		return new ResponseEntity<String>(" shopping details ::"+ bilDetails,HttpStatus.OK);
	}
	
	
	
}
