/**
 * Copyright (c) 2013,������ͨ�Ƽ��ɷ����޹�˾ All rights reserved.
 */
package webapp.util.jaxb;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXB;

/**
 * ������������
 * 
 * @author limeng
 */
public class CommandLoader {

	public static Commands init() throws IOException {
		return JAXB.unmarshal(
				CommandLoader.class.getClassLoader().getResource("command.xml")
						.openStream(), Commands.class);
	}
	
	public static void main(String[] args) {
//		Commands commands = new Commands();
//		List<Command> list = new ArrayList<Command>();
//		Command com= new Command();
//		com.setConvertClassName("test");
//		com.setGenericType(true);
//		com.setGenericTypeClassName("test");
//		com.setName("test");
//		list.add(com);
//		commands.setCommands(list);
//		JAXB.marshal(commands, new File("test.xml"));
		List<Command> list = new ArrayList<Command>();
		System.out.println(list.getClass() instanceof Class );
		System.out.println(CommandLoader.class.getClass() instanceof Class );
		
	}

}
