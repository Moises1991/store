package es.moisespi.store.core.api.service;

import java.util.List;

import es.moisespi.store.core.api.dto.ClientDto;

public interface ClientService {
	
	public ClientDto create(ClientDto clientDto);
	
	public List<ClientDto> list(ClientDto clientDto);
	
	public ClientDto update(ClientDto clientDto);
	
	public void delete(Long id);
	
}
