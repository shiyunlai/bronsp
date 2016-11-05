/**
 * 
 */
package org.bronsp.trans.service.dto;

import java.io.Serializable;

/**
 * 响应
 * 
 * @author megapro
 *
 */
public class TransResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2168760103130035089L;

	private String retCode;

	private String retMessage;

	private String retData;

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getRetMessage() {
		return retMessage;
	}

	public void setRetMessage(String retMessage) {
		this.retMessage = retMessage;
	}

	public String getRetData() {
		return retData;
	}

	public void setRetData(String retData) {
		this.retData = retData;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("retCode=").append(retCode).append("\n");
		sb.append("retMessage=").append(retMessage).append("\n");
		sb.append("retData").append(retData).append("\n");
		return sb.toString();
	}
}
