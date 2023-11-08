package test;

public class Staff {
    //员工属性 - 姓名 工资
    private String name;
    private int wages;

    public Staff() {
    }

    public Staff(String name, int wages) {
        this.name = name;
        this.wages = wages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }
}
