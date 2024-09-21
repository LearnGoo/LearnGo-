import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class TutorMapper {
    public TutorResponseDTO convertToDTO(Tutor tutor){
        return modelMapper.map(tutor, TutorResponseDTO.class);
    }
    public List<TutorResponseDTO> convertToListDTO(List<Tutor> tutores){
        return tutores.stream().map(this::convertToDTO).toList();
    }
}