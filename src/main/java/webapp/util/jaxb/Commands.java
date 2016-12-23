/**
 * Copyright (c) 2013,������ͨ�Ƽ��ɷ����޹�˾ All rights reserved.
 */
package webapp.util.jaxb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 
 * 
 * @author limeng
 */
@XmlRootElement(name = "commands")
@XmlSeeAlso({ Command.class })
public class Commands {

	private Map<String, Command> commandsMap = new HashMap<String, Command>();

	List<Command> commands;

	public Commands() {
	}

	public Commands(List<Command> commands) {
		this.commands = commands;
	}

	public void addCommand(Command command) {
		commandsMap.put(command.getName(), command);
	}

	/**
	 * �������ƻ�ȡ�������
	 * 
	 * @param name
	 * @return
	 */
	public Command getCommand(String name) {
		bindMap();
		return commandsMap.get(name);
	}

	/**
	 * ��Map
	 */
	private void bindMap() {
		if (commandsMap.isEmpty()) {
			for (Command command : commands) {
				commandsMap.put(command.getName(), command);
			}
		}
	}

	public Map<String, Command> getCommandsMap() {
		bindMap();
		return commandsMap;
	}

	
	public List<Command> getCommands() {
		return commands;
	}
	@XmlElement(name="command")
	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}

	@Override
	public String toString() {
		return "Commands [commandsMap=" + commandsMap + ", commands="
				+ commands + "]";
	}

	
}
