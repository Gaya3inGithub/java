package j20_Collection;

public class Student {
	  private int id;
	    private String name;
	    private String department;
	    private int yearOfPassing;

	    public Student(int id, String name, String department, int yearOfPassing) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.yearOfPassing = yearOfPassing;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public int getYearOfPassing() {
	        return yearOfPassing;
	    }

	    public void setYearOfPassing(int yearOfPassing) {
	        this.yearOfPassing = yearOfPassing;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Year of Passing: " + yearOfPassing;
	    }
}


