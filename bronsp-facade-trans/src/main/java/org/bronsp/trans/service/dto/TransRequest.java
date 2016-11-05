/**
 * 
 */
package org.bronsp.trans.service.dto;

import java.io.Serializable;

/**
 * 请求
 * 
 * @author megapro
 *
 */
public class TransRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2281801186431349299L;

	private String transCode;
	private String funCode;
	private String channelId;
	private TransData transData;

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getFunCode() {
		return funCode;
	}

	public void setFunCode(String funCode) {
		this.funCode = funCode;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public TransData getTransData() {
		return transData;
	}

	public void setTransData(TransData transData) {
		this.transData = transData;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("transCode=").append(transCode).append("\n");
		sb.append("funCode=").append(funCode).append("\n");
		sb.append("channelId=").append(channelId).append("\n");
		sb.append(" trans data is :").append("\n") ;
		sb.append(transData.toString()) ;
		return sb.toString();
	}
}
