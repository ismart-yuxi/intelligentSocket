package com.putapi.intelligentSocket.server.pool;

import java.nio.channels.SocketChannel;
/**
 * worker接口
 * @author wangyuxi
 *
 */
public interface Worker {
	
	/**
	 * 加入一个新的客户端会话
	 * @param channel
	 */
	 void registerNewChannelTask(SocketChannel channel);

}
