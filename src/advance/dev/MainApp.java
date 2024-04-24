package advance.dev;

import java.util.Scanner;

public class MainApp {
	 public static void main(String[] args) {
	        Person[] persons = new Person[5];
	        input(persons);
	        print(persons);
	    }

	    // Hàm nhập thông tin cho danh sách student và teacher
	    public static void input(Person[] persons) {
	        Scanner scanner = new Scanner(System.in);
        	System.out.println("*Nhập danh sách 3 học sinh và 2 giáo viên");
	        for (int i = 0; i < persons.length; i++) {
	            System.out.println(" Nhập thông tin Người thứ " + (i + 1));
	            System.out.print("Tên: ");
	            String name = scanner.nextLine();
	            System.out.print("Tuổi: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); 
	            
	            if (i < 3) { // Nếu là sinh viên
	                System.out.print("Toán: ");
	                double toan = scanner.nextDouble();
	                System.out.print("Lý: ");
	                double ly = scanner.nextDouble();
	                System.out.print("Hóa: ");
	                double hoa = scanner.nextDouble();
	                scanner.nextLine(); // Đọc bỏ dòng mới
	                persons[i] = new Student(name, age, toan, ly, hoa);
	            } else { // Nếu là giáo viên
	                System.out.print("Hệ số lương: ");
	                double hsl = scanner.nextDouble();
	                scanner.nextLine(); 
	                persons[i] = new Teacher(name, age, hsl);
	            }
	        }
	        scanner.close();
	    }

	    // Hàm in thông tin của danh sách persons
	    public static void print(Person[] persons) {
	        System.out.println("*THÔNG TIN:");
	        for (Person person : persons) {
	            if (person instanceof Student) { // Nếu là sinh viên
	                Student student = (Student) person;
	                System.out.println("học sinh - Tên: " + student.getName() + ", Tuổi: " + student.getAge() +
	                        ", Toán: " + student.getToan() + ", Lý: " + student.getLy() + ", Hóa: " + student.getHoa() +
	                        ", Điểm Trung Bình: " + student.diemTrungBinh());
	            } else if (person instanceof Teacher) { // Nếu là giáo viên
	                Teacher teacher = (Teacher) person;
	                System.out.println("Giáo viên - Tên: " + teacher.getName() + ", Tuổi: " + teacher.getAge() +
	                        ", Hệ số lương: " + teacher.getHsl() + ", Lương: " + teacher.tinhLuong());
	            }
	        }
	    }
}

