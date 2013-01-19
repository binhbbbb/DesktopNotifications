package com.github.wolfie.desktopnotifications.shared;

import com.vaadin.shared.communication.ServerRpc;

public interface DesktopNotifierServerRpc extends ServerRpc {
	void notificationsAreAllowedAndSupported(boolean allowed, boolean supported);

	void notificationsAreSupported(boolean supported);
}
