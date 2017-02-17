package cn.edu.sdut.softlab.cooker;

import cn.edu.sdut.softlab.poweradaptor.PowerAdaptor;
import cn.edu.sdut.softlab.powerinterface.CN220VInterface;
import cn.edu.sdut.softlab.powerinterface.CN220VInterfaceImpl;

/**
 * 适配器开始工作 使用中国的220V电源 利用适配器 使用日本的110V的电饭煲工作
 */
public class AdaptorWork {
	public static void main(String[] args) {
		// 使用中国的220V电源
		CN220VInterface cn220VInterface = new CN220VInterfaceImpl();
		// 使用电源适配器
		PowerAdaptor powerAdaptor = new PowerAdaptor(cn220VInterface);
		// 使用日本110V电源的电饭煲
		JP110VElectricCooker cooker = new JP110VElectricCooker(powerAdaptor);
		// 开始工作
		cooker.cook();
	}
}
