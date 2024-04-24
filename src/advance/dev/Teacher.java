package advance.dev;

public class Teacher extends Person {
	 protected double hsl; 

	    public Teacher(String name, int age, double hsl) {
	        super(name, age);
	        this.hsl = hsl;
	    }

	    // get set hsl
	    public double getHsl() {
	        return hsl;
	    }

	    public void setHsl(double hsl) {
	        this.hsl = hsl;
	    }

	    // tính lương
	    public double tinhLuong() {
	        double luongCoBan = 1800000; // Lương cơ bản
	        return luongCoBan * hsl;
	    }
}