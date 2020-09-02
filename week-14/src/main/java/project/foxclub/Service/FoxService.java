package project.foxclub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.foxclub.Model.Fox;
import project.foxclub.Repository.Foxes;

@Service
public class FoxService {

    Foxes foxes;
    public FoxService(Foxes foxes) {
        this.foxes = foxes;
    }

    public Fox getFox (String name){
        if (!foxes.containsFox(name)){
            foxes.addFox(name);
        }
        return foxes.findByName(name);
    }
}
