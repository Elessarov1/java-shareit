package ru.practicum.shareit.user.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Builder
public class UserDto {
    private long id;
    @NotBlank(groups = {NewUser.class})
    private String name;
    @Email(groups = {NewUser.class, UpdateUser.class})
    @NotBlank(groups = {NewUser.class})
    private String email;

    public interface NewUser {
    }

    public interface UpdateUser {
    }
}
