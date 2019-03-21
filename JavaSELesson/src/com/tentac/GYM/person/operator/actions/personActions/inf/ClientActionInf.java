package com.tentac.GYM.person.operator.actions.personActions.inf;

import com.tentac.GYM.person.bean.Client;
import com.tentac.GYM.person.operator.actions.baseActions.ActionInf;

public interface ClientActionInf extends ActionInf{

	//新会员注册
	public String addNewClient(Client[] clients,Client c);
	
	//根据会员手机号码查找会员相信信息
	public String findDetailsOfClientByPhone(Client[] clients,String phone_num);
//	public Client findDetailsOfClientByPhone(Client[] clients,String phone_num);
	
	//根据会员手机号、会员ID，修改会员个人信息
	public String modifyDetailsOfClient(String phone_num,String client_id,Client[] clients,Client c);
	
	//根据会员手机号、会员ID，删除已经过期还未续费的会员信息
	public String deleteClient(String phone_num,String client_id,Client[] clients);
	
}
