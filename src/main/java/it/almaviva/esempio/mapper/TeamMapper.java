package it.almaviva.esempio.mapper;

import org.springframework.stereotype.Component;

import it.almaviva.esempio.DTO.TeamDTO;
import it.almaviva.esempio.entity.Team;

@Component
public class TeamMapper {

    public TeamDTO toDto(Team entity) {
        TeamDTO dto = new TeamDTO();
        dto.setName(entity.getName());
        dto.setMembers(entity.getMembers());
        dto.setPrimaryColor(entity.getPrimaryColor());
        return dto;
    }

    public Team toEntity(TeamDTO dto) {
        Team entity = new Team();
        entity.setName(dto.getName());
        entity.setMembers(dto.getMembers());
        entity.setPrimaryColor(dto.getPrimaryColor());
        return entity;
    }
}