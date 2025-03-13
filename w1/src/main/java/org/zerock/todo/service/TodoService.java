package org.zerock.todo.service;

import org.zerock.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    INSTANCE;

    public void register(TodoDTO todoDTO) {
        System.out.println("DEBUG.................." + todoDTO);
    }

    public List<TodoDTO> getList(){
        return IntStream.range(0, 10)
                                          .mapToObj(i -> {
                                              TodoDTO dto = new TodoDTO();
                                              dto.setTno((long)i);
                                              dto.setTitle("DTO (" + i + ")");
                                              dto.setDueDate(LocalDate.now());
                                              return dto;
                                          })
                        .collect(Collectors.toList());
    }
}
