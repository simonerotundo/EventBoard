package it.sad.students.eventboard.persistenza.dao.postgresDao;

import it.sad.students.eventboard.persistenza.dao.EventTypeDao;
import it.sad.students.eventboard.persistenza.model.EventType;

import java.sql.Connection;
import java.util.List;

public class EventTypeDaoPostgres implements EventTypeDao {
    Connection conn;

    public EventTypeDaoPostgres(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<EventType> findAll() {
        return null;
    }

    @Override
    public EventType findByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public void saveOrUpdate(EventType eventType) {

    }

    @Override
    public void delete(EventType eventType) {

    }
}