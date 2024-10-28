package j14_Serialization;

import java.io.Serializable;

public class Stu implements Serializable {
			public  String name;
			public int reg_no,marks;
			public Stu(String name, int reg_no,int Marks) {
				this.reg_no=reg_no;
				this.name=name;
				this.marks=marks;
			}
			

			public String getName() {
				return name;
			}
			
			public int getReg_no() {
				return reg_no;
			}
			
			public int getMarks() {
				return marks;
			}

}
