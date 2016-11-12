package org.lqk.lspring.bean;

public class Boss {
    private Office office;
    private Car car;

    public Boss()
    {
    }

    //@Autowired
    public Boss(Car car) {
        this.car = car;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
    public String tostring() {
        return "This Boss has " + car.tostring() + ", now he is in " + office.tostring()+".";
    }
}
