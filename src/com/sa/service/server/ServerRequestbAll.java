/**
 *
 * 项目名称:[NettyServer]
 * 包:	 [com.sa.service]
 * 类名称: [ServerRequestbRoom]
 * 类描述: [一句话描述该类的功能]
 * 创建人: [Y.P]
 * 创建时间:[2017年7月4日 上午11:43:47]
 * 修改人: [Y.P]
 * 修改时间:[2017年7月4日 上午11:43:47]
 * 修改备注:[说明本次修改内容]
 * 版本:	 [v1.0]
 *
 */
package com.sa.service.server;

import java.util.TreeMap;

import com.sa.base.ServerManager;
import com.sa.net.Packet;
import com.sa.net.PacketType;

public class ServerRequestbAll extends Packet {
	public ServerRequestbAll(){}
	
	@Override
	public PacketType getPacketType() {
		return PacketType.ServerRequestbAll;
	}

	@Override
	public void execPacket() {
		//System.out.println("SEND ServerRequestbAll " + this.getFromUserId() + "[" + this.getOption(1) + "]");
		ServerManager.INSTANCE.sendServerRequest(this);
	}

}
