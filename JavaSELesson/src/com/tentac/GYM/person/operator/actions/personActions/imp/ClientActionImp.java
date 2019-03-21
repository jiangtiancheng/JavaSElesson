package com.tentac.GYM.person.operator.actions.personActions.imp;

import com.tentac.GYM.person.bean.Client;
import com.tentac.GYM.person.operator.actions.personActions.inf.ClientActionInf;

public class ClientActionImp implements ClientActionInf{

	//新会员注册
		public String addNewClient(Client[] clients,Client c){
			String msg = "";
			int newLength = clients.length+1;
			Client[] newClients = new Client[newLength];
			int i;
			for(i=0;i<clients.length;i++){
				Client client = clients[i];
				String phone = client.getPhone_num();
				if(phone.equals(c.getPhone_num())){
					msg = "该客户已经注册，不可以重复注册";
				}
				newClients[i] = client;
			}
			newClients[newLength-1] = c;
			msg = "新客户注册成功！客户信息如下："+c.toString();
			return msg;
		}
		//根据会员手机号码查找会员相信信息
		public String findDetailsOfClientByPhone(Client[] clients,String phone_num){
			String msg = "";
			Client client = null;
			for(int i=0;i<clients.length;i++){
				Client c = clients[i];
				if(c.getPhone_num().equals(phone_num)){
					client = c;
				}else{
					msg = "输入的电话号码不存在，请核实后再次输入...";
					break;
				}
			}
			msg = "根据您输入的电话号码，查找到的客户信息如下：".concat(client.toString());
			return msg;
		}
		//根据会员手机号、会员ID，修改会员个人信息
		public String modifyDetailsOfClient(String phone_num,String client_id,Client[] clients,Client c){
			String msg = "";
			for(int i=0;i<clients.length;i++){
				Client clit = clients[i];
				if(!clit.getId().equals(client_id) || !clit.getPhone_num().equals(phone_num)){
					msg = "您输入的电话号码或会员ID有误，请再次确认后重新输入！";
					break;
				}else if(clit.getId().equals(client_id) && clit.getPhone_num().equals(phone_num)){
					clit.setAge(c.getAge());
					clit.setCoach(c.getCoach());
					clit.setFees(c.getFees());
					clients[i] = clit;
				}
				msg = "客户信息修改成功，新信息如下："+clit.toString();
			}
			return msg;
		}
		
		//根据会员手机号、会员ID，删除已经过期还未续费的会员信息
		public String deleteClient(String phone_num,String client_id,Client[] clients){
			String msg = "";
			
			return msg;
		}
}
