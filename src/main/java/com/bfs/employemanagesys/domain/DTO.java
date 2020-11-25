package com.bfs.employemanagesys.domain;

public interface DTO<T> {
    void convertToDTO(T t);
    void convertToEntity(T t);
}
