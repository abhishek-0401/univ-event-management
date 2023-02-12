package com.geekster.univeventmanagement.service;

import com.geekster.univeventmanagement.model.Event;

import java.util.List;

public interface IEventService {
    public void addEvent(Event event);
    public void updateEvent(int eventId, Event event);
    public void deleteEvent(int eventId);
    public List<Event> findByDate(String dated);
}
