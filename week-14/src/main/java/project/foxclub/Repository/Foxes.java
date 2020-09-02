package project.foxclub.Repository;

import org.springframework.stereotype.Repository;
import project.foxclub.Model.Fox;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Repository
public class Foxes {
    private List<Fox> foxes;

    public Foxes() {
        this.foxes = new ArrayList<>() {
        };
    }

    public void addFox (String name){
        foxes.add(new Fox(name));
    }
    public Fox findByName(String name){
        return foxes.stream().filter(fox -> fox.getName().equals(name)).findFirst().get();
    }
    public boolean containsFox(String name){
        return foxes.stream().anyMatch(fox -> fox.getName().equals(name));

    }

}
