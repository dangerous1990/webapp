/**
 * Copyright (c) 2013,������ͨ�Ƽ��ɷ����޹�˾ All rights reserved.
 */
package webapp.util.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ����
 * 
 * @author limeng
 */
@XmlRootElement
public class Command {
	public Command() {

	}

	public Command(String name, String convertClassName) {
		this.name = name;
		this.convertClassName = convertClassName;
	}

	/**
	 * ��������
	 */
	private String name;

	/**
	 * ת��������
	 */
	private String convertClassName;
	
	/**
	 * ���Ϸ��͵�class���� ��Map��keyֵĬ��String����
	 */
	private String genericTypeClassName;
	
	/**
	 * 
	 */
	private boolean isGenericType = false;
	

	public boolean isGenericType() {
		return isGenericType;
	}
	@XmlAttribute
	public void setGenericType(boolean isGenericType) {
		this.isGenericType = isGenericType;
	}

	public String getGenericTypeClassName() {
		return genericTypeClassName;
	}
	@XmlAttribute
	public void setGenericTypeClassName(String genericTypeClassName) {
		this.genericTypeClassName = genericTypeClassName;
	}

	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	public String getConvertClassName() {
		return convertClassName;
	}

	@XmlAttribute
	public void setConvertClassName(String convertClassName) {
		this.convertClassName = convertClassName;
	}

	@Override
	public String toString() {
		return "Command [name=" + name + ", convertClassName="
				+ convertClassName + "]";
	}

}
