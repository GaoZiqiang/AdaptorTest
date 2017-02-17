package cn.edu.sdut.softlab.poweradaptor;

import cn.edu.sdut.softlab.powerinterface.CN220VInterface;
import cn.edu.sdut.softlab.powerinterface.JP110VInterface;

/**
 * 电源适配器 继承JP110VInterface，用220VInterface进行适配 实现JP110VInterface的方法
 * 
 */
public class PowerAdaptor implements JP110VInterface {
	private CN220VInterface cn220VInterface;

	public PowerAdaptor(CN220VInterface cn220VInterface) {//注意:该构造器需要设置为public类型的
		this.cn220VInterface = cn220VInterface;
	}

	@Override
	public void connect() {
		cn220VInterface.connect();
	}

}
