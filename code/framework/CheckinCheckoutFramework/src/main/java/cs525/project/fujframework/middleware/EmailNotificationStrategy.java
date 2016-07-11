/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the MIT License (MIT);
 * 
 */

package cs525.project.fujframework.middleware;

/**
 * provides a concrete class for email notification strategy and implements
 * NotificationStrategy interface
 * 
 * @author Jivan Nepali
 * 
 * @version 1.0.0
 *
 */
public class EmailNotificationStrategy implements NotificationStrategy {

	private Message message;

	public EmailNotificationStrategy() {
	}

	@Override
	public void sendNotification(String message, Person person) {

	}

}
