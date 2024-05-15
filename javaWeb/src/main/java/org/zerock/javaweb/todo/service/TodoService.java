package org.zerock.javaweb.todo.service;

import java.util.List;
import org.zerock.javaweb.todo.DTO.TodoDTO;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
INSTANCE;

public void register(TodoDTO todoDTO) {
    System.out.println("DEBUG ... ..." + todoDTO);
}

public List<TodoDTO> getList() {
    List<TodoDTO> todoDTOS = (List<TodoDTO>) IntStream.range(0, 10)
            .mapToObj(i -> {
                TodoDTO dto = new TodoDTO();
                dto.setTno((long) i);
                dto.setTitle("Todo..." + i);
                dto.setDueDate(LocalDate.now());

                return dto;
            }).collect(Collectors.toList());

    return todoDTOS;
}

    public TodoDTO get(Long tno) {
        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;
    }

}
