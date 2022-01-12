package it.almaviva.esempio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.almaviva.esempio.DTO.TeamDTO;
import it.almaviva.esempio.entity.Team;
import it.almaviva.esempio.mapper.TeamMapper;
import it.almaviva.esempio.repository.TeamRepository;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private TeamMapper teamMapper;

    public TeamDTO getById(Long id) {
        Optional<Team> resultOpt = teamRepository.findById(id);
        return resultOpt.isPresent() ? teamMapper.toDto(resultOpt.get()) : null;
    }

    public void create(TeamDTO dto) {
        teamRepository.save(teamMapper.toEntity(dto));
    }
}