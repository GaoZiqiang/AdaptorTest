package cn.edu.sdut.softlab.powerinterface;

/**
 * 中国220V电源接口实现
 * 
 */
public class CN220VInterfaceImpl implements CN220VInterface {

	@Override
	public void connect() {
		System.out.println("接通电源，开始工作!");
	}

}
