package tourismback.mapper.auth;

import org.mapstruct.Mapper;
import tourismback.dto.auth.UsersDTO;
import tourismback.entity.auth.Users;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsersMapper {
    UsersDTO toDto(Users users);

    Users toModel(UsersDTO usersDTO);

    List<UsersDTO> toDtoList(List<Users> users);

    List<Users> toModelList(List<UsersDTO> usersDTOS);
}
