package ru.practicum.shareit.item.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import ru.practicum.shareit.booking.model.ShortBooking;

import java.util.List;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemResponseDto {
    long id;
    String name;
    String description;
    Boolean available;
    //ItemRequest request;
    ShortBooking lastBooking;
    ShortBooking nextBooking;
    List<CommentResponseDto> comments;

}
