package pe.edu.utec.dbp.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pe.edu.utec.dbp.entity.CampusEvent;

@Service
@RequiredArgsConstructor
public class CampusEventService {
    private final CampusEventRepository campuseventRepository;
    private final ModelMapper modelMapper;
    public ResponseDTO create(RequestDTO dto) {
        // Busqueda
        CampusEventSaved = repository.save(entity);
        return modelMapper.map(saved, ResponseDTO.class);
    }
}
