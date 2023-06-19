package service;

import Entity.CitizenTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.Respository;

@Service
public class CitizenService {

    @Autowired
    Respository respository;

    public String saveCitizen(CitizenTo citi) throws Exception {
        CitizenTo citizen = citi.getId()==0?new CitizenTo():
                respository.findById(citi.getId()).orElseThrow(() ->new RuntimeException("NO_DATE_FOUND"));
        if(citi.getName()==null){
            throw new Exception("Name should not be null");
        }
        if(citi.getAddress()==null){
            throw new Exception("Address should not be null");
        }
        if(citi.getPhone()==null){
            throw new Exception("PHONE should not be null");
        }
        if(citi.getDob()==null){
            throw new Exception("DOB should not be null");
        }
        respository.save(citizen);
        return "Citizen has CREATED successfully with id"+citizen.getId();
    }
}
