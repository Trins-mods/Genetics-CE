package dev.trinsdar.core.api.gui.events;


import dev.trinsdar.core.api.gui.IWidget;

public class Event {
	private final IWidget origin;

	public Event(final IWidget origin) {
		this.origin = origin;
	}

	public IWidget getOrigin() {
		return this.origin;
	}

	public boolean isOrigin(final IWidget widget) {
		return this.origin == widget;
	}
}
