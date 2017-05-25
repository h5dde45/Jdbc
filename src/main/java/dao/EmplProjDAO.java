package dao;

import entity.EmplProj;

import java.util.List;

public interface EmplProjDAO {
    //create
    void add(EmplProj emplProj);

    //read
    List<EmplProj> getAll();
    EmplProj getByEmployeeIdAndProjctId(Long employeeId, Long projectId);

    //update
    void update(EmplProj emplProj);

    //delete
    void delete(EmplProj emplProj);
}
