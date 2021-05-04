package advancedprogramming.latihan.service;

import advancedprogramming.latihan.model.Staff;
import advancedprogramming.latihan.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegisterStaff implements Register{

    StaffRepository staffRepository;

    @Autowired
    public RegisterStaff(StaffRepository staffRepository){
        this.staffRepository = staffRepository;
    }

    @Override
    public void Regis(Staff staff){
        staffRepository.save(staff);
    }

    @Override
    public List<Staff> displayStaff(){
        List<Staff> staffList = staffRepository.findAll();
        return staffList;
    }

    @Override
    public Staff findbyName(String name){
        return staffRepository.getOne(name);
    }
}
