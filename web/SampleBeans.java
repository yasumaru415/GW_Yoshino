package web;

import java.io.Serializable;
//カプセル化のような内容で情報を格納、保持する役割
public class SampleBeans implements Serializable {
private int salary = 0;


public int getSalary() {
	return salary;

}

public void setSalary(int salary) {
	this.salary = salary;
}
}
