package controller;

import Entity.CitizenTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CitizenService;

@RestController
@RequestMapping("/citizen")
@CrossOrigin("*")
public class citizenController {

    @Autowired
    CitizenService citizenService;

    @PostMapping("/save")
    public String save(CitizenTo citi) throws Exception {
        return citizenService.saveCitizen(citi);
    }
}
