package com.putapi.intelligentSocket.server.pool;

import java.nio.channels.ServerSocketChannel;
/**
 * boss接口
 * @author wangyuxi
 *
 */
public interface Boss {
	
	/**
	 * 加入一个新的ServerSocket
	 * @param serverChannel
	 */
	 void registerAcceptChannelTask(ServerSocketChannel serverChannel);
}
