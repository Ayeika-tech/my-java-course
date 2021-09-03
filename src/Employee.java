
public class Employee {

    // Fields inside this class must be private so that they are not corrupted
    private String _name;
    private int _idNumber;
    private String _department;
    private String _position;

    // This first constructor takes all 4 arguments
    public Employee(String name, int idNumber, String department, String position) {
        _name = name;
        _idNumber = idNumber;
        _department = department;
        _position = position;
    }

    // Second constructor takes just 2 arguments
    public Employee(String name, int idNumber) {
        _name = name;
        _idNumber = idNumber;
        _department = "";
        _position = "";
    }

    // Third constructor has no arguments
    public Employee() {
        _name = "";
        _idNumber = 0;
        _department = "";
        _position = "";
    }

    // Here I start the setter methods
    public void setName(String name) {
        this._name = name;
    }

    public void setIdNumber(int idNumber) {
        this._idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this._department = department;
    }

    public void setPosition(String position) {
        this._position = position;

    }

    // Now I will set the getter methods
    public String getName() {
        return _name;
    }

    public int getIdNumber() {
        return _idNumber;
    }

    public String getDepartment() {
        return _department;
    }

    public String getPosition() {
        return _position;
    }

}
