package pe.edu.tecsup.solicitudesapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.solicitudesapi.models.Solicitud;
import pe.edu.tecsup.solicitudesapi.repositories.SolicitudRepository;


@Service
public class SolicitudService {
	
	@Autowired
	private SolicitudRepository solicitudrepository;
	
	public List<Solicitud> listar() {
		return solicitudrepository.listar();
	}
	
	public void crear(Solicitud solicitud) {
		solicitudrepository.crear(solicitud);
	}

	
}
