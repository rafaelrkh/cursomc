package com.rafael.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.cursomc.domain.Categorias;
import com.rafael.cursomc.domain.Pedidos;
import com.rafael.cursomc.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;

	
	@RequestMapping(value="/{cd_pedido}", method=RequestMethod.GET)
	public ResponseEntity<Pedidos> find(@PathVariable Integer cd_pedido) {	
		
		Pedidos obj = service.find(cd_pedido);
		
		return ResponseEntity.ok().body(obj);
	}
}
