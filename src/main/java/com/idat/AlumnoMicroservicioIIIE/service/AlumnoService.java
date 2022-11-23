package com.idat.AlumnoMicroservicioIIIE.service;

import java.util.List;

import com.idat.AlumnoMicroservicioIIIE.dto.AlumnoDTO;

public interface AlumnoService {
	
	public List<AlumnoDTO> listar();
	public AlumnoDTO obtener(Integer id);
	public void registrar(AlumnoDTO alumnoDto);
	public void actualizar(AlumnoDTO alumnoDto);
	public void eliminar(Integer id);
	
}
