package com.idat.AlumnoMicroservicioIIIE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.AlumnoMicroservicioIIIE.dto.AlumnoDTO;
import com.idat.AlumnoMicroservicioIIIE.service.AlumnoService;

@RestController
@RequestMapping("/alumno/v1")
public class AlumnoController {

	@Autowired
	private AlumnoService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<AlumnoDTO> listar(){
		return service.listar();
	}
	
	@GetMapping("/obtener/{id}")
	public @ResponseBody AlumnoDTO obtener(@PathVariable Integer id){
		return service.obtener(id);
	}
	
	@PostMapping("/registrar")
	public @ResponseBody void guardar(@RequestBody AlumnoDTO alumnoDto) {
		service.registrar(alumnoDto);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody AlumnoDTO alumnoDto) {
		service.actualizar(alumnoDto);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
}
