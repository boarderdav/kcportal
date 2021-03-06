/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.notifications.service.base;

import com.liferay.notifications.service.UserNotificationEventLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserNotificationEventLocalServiceClpInvoker {
	public UserNotificationEventLocalServiceClpInvoker() {
		_methodName0 = "addUserNotificationEvent";

		_methodParameterTypes0 = new String[] {
				"com.liferay.notifications.model.UserNotificationEvent"
			};

		_methodName1 = "createUserNotificationEvent";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteUserNotificationEvent";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteUserNotificationEvent";

		_methodParameterTypes3 = new String[] {
				"com.liferay.notifications.model.UserNotificationEvent"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchUserNotificationEvent";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getUserNotificationEvent";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getUserNotificationEvents";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getUserNotificationEventsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateUserNotificationEvent";

		_methodParameterTypes15 = new String[] {
				"com.liferay.notifications.model.UserNotificationEvent"
			};

		_methodName32 = "getBeanIdentifier";

		_methodParameterTypes32 = new String[] {  };

		_methodName33 = "setBeanIdentifier";

		_methodParameterTypes33 = new String[] { "java.lang.String" };

		_methodName38 = "addUserNotificationEvent";

		_methodParameterTypes38 = new String[] {
				"long", "long", "long", "boolean", "boolean", "boolean"
			};

		_methodName39 = "getArchivedUserNotificationEvents";

		_methodParameterTypes39 = new String[] {
				"long", "boolean", "boolean", "int", "int"
			};

		_methodName40 = "getArchivedUserNotificationEventsCount";

		_methodParameterTypes40 = new String[] { "long", "boolean", "boolean" };

		_methodName41 = "getDeliveredUserNotificationEvents";

		_methodParameterTypes41 = new String[] {
				"long", "boolean", "boolean", "int", "int"
			};

		_methodName42 = "getDeliveredUserNotificationEventsCount";

		_methodParameterTypes42 = new String[] { "long", "boolean", "boolean" };

		_methodName43 = "getNotificationEventByUserNotificationEventId";

		_methodParameterTypes43 = new String[] { "long" };

		_methodName44 = "getUserNotificationEvents";

		_methodParameterTypes44 = new String[] { "long", "boolean", "int", "int" };

		_methodName45 = "getUserNotificationEventsCount";

		_methodParameterTypes45 = new String[] { "long", "boolean" };

		_methodName46 = "updateUserNotificationEvent";

		_methodParameterTypes46 = new String[] {
				"long", "long", "boolean", "boolean", "boolean"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.addUserNotificationEvent((com.liferay.notifications.model.UserNotificationEvent)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.createUserNotificationEvent(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.deleteUserNotificationEvent(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.deleteUserNotificationEvent((com.liferay.notifications.model.UserNotificationEvent)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.fetchUserNotificationEvent(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getUserNotificationEvent(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getUserNotificationEvents(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getUserNotificationEventsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.updateUserNotificationEvent((com.liferay.notifications.model.UserNotificationEvent)arguments[0]);
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			UserNotificationEventLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.addUserNotificationEvent(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Boolean)arguments[3]).booleanValue(),
				((Boolean)arguments[4]).booleanValue(),
				((Boolean)arguments[5]).booleanValue());
		}

		if (_methodName39.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getArchivedUserNotificationEvents(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getArchivedUserNotificationEventsCount(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue());
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getDeliveredUserNotificationEvents(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue());
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getDeliveredUserNotificationEventsCount(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue());
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getNotificationEventByUserNotificationEventId(((Long)arguments[0]).longValue());
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getUserNotificationEvents(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.getUserNotificationEventsCount(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return UserNotificationEventLocalServiceUtil.updateUserNotificationEvent(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Boolean)arguments[2]).booleanValue(),
				((Boolean)arguments[3]).booleanValue(),
				((Boolean)arguments[4]).booleanValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName38;
	private String[] _methodParameterTypes38;
	private String _methodName39;
	private String[] _methodParameterTypes39;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName46;
	private String[] _methodParameterTypes46;
}