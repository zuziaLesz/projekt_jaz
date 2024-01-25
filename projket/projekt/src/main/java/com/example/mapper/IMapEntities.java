package com.example.mapper;

public interface IMapEntities <TDto, TEntity>{
        TEntity mapToEntity(TDto item);
        TDto mapToDto(TEntity item);
}
