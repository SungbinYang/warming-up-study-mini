package com.miniproject.commute.controller.team;

import com.miniproject.commute.dto.team.request.TeamSaveRequest;
import com.miniproject.commute.dto.team.response.TeamGetResponse;
import com.miniproject.commute.service.team.TeamService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/team")
    public void saveTeam(@RequestBody @Valid TeamSaveRequest request){
        teamService.saveTeam(request);
    }

    @GetMapping("/team")
    public List<TeamGetResponse> getTeams(){
        return teamService.getTeams();
    }
}
