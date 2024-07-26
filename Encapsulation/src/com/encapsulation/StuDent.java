package com.encapsulation;

public class StuDent {

		String name;
		int regnum;
		int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRegnum() {
			return regnum;
		}
		public void setRegnum(int regnum) {
			this.regnum = regnum;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "StuDent [name=" + name + ", regnum=" + regnum + ", age=" + age + "]";
		}
		
	

}
