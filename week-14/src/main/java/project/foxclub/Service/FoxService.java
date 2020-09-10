package project.foxclub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.foxclub.Model.Fox;
import project.foxclub.Model.Trick;
import project.foxclub.Repository.Foxes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Trick> getNotLearnedTricks(String name){
        return Arrays.stream(Trick.values())
                .filter(trick ->
                !getFox(name).getTricks().equals(Arrays.asList(Trick.values())))
                .collect(Collectors.toList());
    }
}
