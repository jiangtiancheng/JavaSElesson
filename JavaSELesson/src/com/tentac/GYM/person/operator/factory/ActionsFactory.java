package com.tentac.GYM.person.operator.factory;


import com.tentac.GYM.person.operator.actions.baseActions.ActionInf;
import com.tentac.GYM.person.operator.actions.deviceActions.imp.FacilityActionImp;
import com.tentac.GYM.person.operator.actions.deviceActions.imp.FitnessEquipmentActionImp;
import com.tentac.GYM.person.operator.actions.personActions.imp.BossActions;
import com.tentac.GYM.person.operator.actions.personActions.imp.ClientActionImp;
import com.tentac.GYM.person.operator.actions.personActions.imp.EmployeeActionImp;

public class ActionsFactory {

	/*
	 * 单例模式的一个应用：确保ActionsFactory类只有一个唯一的实例对象，无论是谁在哪里创建
	 * 本类的实例对象，都是这个唯一的一个实例对象。
	 */
	private static ActionsFactory factory = null;
	private ActionsFactory(){
		
	}
	public static ActionsFactory getInstance(){
		factory = new ActionsFactory();
		return factory;
	}
	
	
	/**
	 * 根据传入的参数信息，自动决定实例化哪种类型的Action实例，并返回
	 * @param doWhat  传递进来需要做那种操作动作的字符串信息，以此作为实例化哪一个Action实例的依据
	 * @return  具体的Action实例对象
	 */
	public ActionInf getInstance(String doWhat){
		
		ActionInf action = null;
		if(doWhat.equals("/增加会员")||doWhat.equals("/删除会员")||
						doWhat.equals("/根据电话号码查询会员")||doWhat.equals("/修改会员信息")){
			
			action = this.getClientActionInstance(doWhat);
			
		}else if(doWhat.equals("/增加员工")||doWhat.equals("/删除员工")||
						doWhat.equals("/根据员工ID查询员工")||doWhat.equals("/修改员工信息")){
			
			action = this.getEmpActionInstance(doWhat);
			
		}else if(doWhat.equals("/增加器械")||doWhat.equals("/删除器械")||
						doWhat.equals("/根据器械名称查询器械详情")||doWhat.equals("/修改器械详情信息")){
			
			action = this.getFitnessEqumtInstance(doWhat);
			
		}else if(doWhat.equals("/增加设施")||doWhat.equals("/删除设施")||
						doWhat.equals("/根据设施ID查询设施详情")||doWhat.equals("/修改设施详情信息")){
			
			action = this.getFacilityInstance(doWhat);
			
		}else if(doWhat.equals("/boss操作")){
			
			action = this.getBossActionInstance(doWhat);
		}
		
		return action;
	}
	/**
	 * 获得一个"ClientAction"实例对象的方法；
	 * @param doWhat
	 * @return
	 */
	public ActionInf getClientActionInstance(String doWhat){
		
		ActionInf clientAction = new ClientActionImp();
		
		return clientAction;
	}
	/**
	 * 获得一个"EmployeeAction"实例对象的方法；
	 * @param doWhat
	 * @return
	 */
	public ActionInf getEmpActionInstance(String doWhat){
		
		ActionInf empAction = new EmployeeActionImp();
		
		return empAction;
	}
	/**
	 * 获得一个"BossAction"实例对象的方法；
	 * @param doWhat
	 * @return
	 */
	public ActionInf getBossActionInstance(String doWhat){
		
		ActionInf bossAction = new BossActions();
		
		return bossAction;
	}
	/**
	 * 获得一个“器械Action”实例对象的方法；
	 * @param doWhat
	 * @return
	 */
	public ActionInf getFitnessEqumtInstance(String doWhat){

		ActionInf fitnessAction = new FitnessEquipmentActionImp();
		
		return fitnessAction;
	}
	/**
	 * 获得一个“设施Action”实例对象的方法；
	 * @param doWhat
	 * @return
	 */
	public ActionInf getFacilityInstance(String doWhat){
		
		ActionInf facilityAction = new FacilityActionImp();
		
		return facilityAction;
	}
}
