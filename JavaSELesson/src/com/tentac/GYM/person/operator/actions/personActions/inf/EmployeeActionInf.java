package com.tentac.GYM.person.operator.actions.personActions.inf;

import com.tentac.GYM.person.bean.Employee;
import com.tentac.GYM.person.operator.actions.baseActions.ActionInf;

public interface EmployeeActionInf extends ActionInf{

	public static final String GYM_NAME = "GYM0102";
	
	//员工新增入职
	public String insertNewEmployee(Employee[] emp,Employee e);
	
	//根据员工id信息修改员工 信息
	public String modifyEmplyoeeInfo(String id,Employee[] es,Employee newEmp);
	
	//根据员工id信息、员工电话信息来修改员工 信息
//	public String modifyEmplyoeeInfo(String id,String phone,Employee[] es,Employee newEmp);
	
	//员工离职,根据员工ID信息删除员工；
	public String dimissionEmployeeInfo(String id,Employee[] es);
	
	//员工信息查询-根据员工电话查询
//	public String findEmployeeInforByPhone(String phone,Employee[] es);
	
	//员工信息查询-根据员工ID查询
	public String findEmployeeInforById(String id,Employee[] es);
	
}
