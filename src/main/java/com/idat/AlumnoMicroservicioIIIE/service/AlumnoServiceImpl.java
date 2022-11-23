package com.idat.AlumnoMicroservicioIIIE.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AlumnoMicroservicioIIIE.dto.AlumnoDTO;
import com.idat.AlumnoMicroservicioIIIE.model.Alumno;
import com.idat.AlumnoMicroservicioIIIE.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public List<AlumnoDTO> listar() {
		
		List<AlumnoDTO> listaDto = new ArrayList<>();
		AlumnoDTO alumnoDto = null;
		
		for (Alumno alumno : repository.findAll()) {
			alumnoDto = new AlumnoDTO();
			alumnoDto.setIdDto(alumno.getIdAlumno());
			alumnoDto.setNombreDto(alumno.getNombre());
			alumnoDto.setApellidoDto(alumno.getApellido());
			listaDto.add(alumnoDto);
		}
		return listaDto;
	}

	@Override
	public AlumnoDTO obtener(Integer id) {
		Alumno alumno = repository.findById(id).orElse(null);
		AlumnoDTO alumnoDto = new AlumnoDTO();
		alumnoDto.setIdDto(alumno.getIdAlumno());
		alumnoDto.setNombreDto(alumno.getNombre());
		alumnoDto.setApellidoDto(alumno.getApellido());
		
		return alumnoDto;
	}

	@Override
	public void registrar(AlumnoDTO alumnoDto) {
		Alumno alumno = new Alumno();
		alumno.setNombre(alumnoDto.getNombreDto());
		alumno.setApellido(alumnoDto.getApellidoDto());
		repository.save(alumno);
	}

	@Override
	public void actualizar(AlumnoDTO alumnoDto) {
		Alumno alumno = new Alumno();
		alumno.setIdAlumno(alumnoDto.getIdDto());
		alumno.setNombre(alumnoDto.getNombreDto());
		alumno.setApellido(alumnoDto.getApellidoDto());
		repository.saveAndFlush(alumno);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	
}
