package it.almaviva.esempio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.almaviva.esempio.DTO.TeamDTO;
import it.almaviva.esempio.service.TeamService;

@RestController
@RequestMapping("api/v1/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(teamService.getById(id));
    }

    @PostMapping
    public ResponseEntity create(@RequestBody TeamDTO dto) {
        teamService.create(dto);
        return ResponseEntity.noContent().build();
    }
}