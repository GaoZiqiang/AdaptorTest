package cn.edu.sdut.softlab.cooker;

import cn.edu.sdut.softlab.powerinterface.JP110VInterface;

/**
 * 使用一个110V电饭煲，使用110V电源做饭
 * 
 */
public class JP110VElectricCooker {
	private JP110VInterface jp110VInterface;

	JP110VElectricCooker(JP110VInterface jp110VInterface) {
		this.jp110VInterface = jp110VInterface;
	}

	// 做饭
	public void cook() {
		jp110VInterface.connect();// 接通电源
		System.out.println("开始做饭!");
	}
}
