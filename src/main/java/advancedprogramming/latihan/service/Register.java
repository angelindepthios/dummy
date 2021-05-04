package advancedprogramming.latihan.service;


import advancedprogramming.latihan.model.Staff;

import java.util.List;

public interface Register {
    public void Regis(Staff staf);
    public List<Staff> displayStaff();
    public Staff findbyName(String name);
}
