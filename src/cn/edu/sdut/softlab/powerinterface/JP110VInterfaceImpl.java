package cn.edu.sdut.softlab.powerinterface;
/**
 * 日本110V接口实现
 * */
public class JP110VInterfaceImpl implements JP110VInterface {

	@Override
	public void connect() {
		System.out.println("接通电源，开始工作!");
	}

}
