package it.sad.students.eventboard.persistenza.dao.postgresDao;

import it.sad.students.eventboard.persistenza.dao.ReportDao;
import it.sad.students.eventboard.persistenza.model.Report;

import java.sql.Connection;
import java.util.List;

public class ReportDaoPostgres implements ReportDao {

    Connection conn;

    public ReportDaoPostgres(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Report> findAll() {
        return null;
    }

    @Override
    public Report findByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public void saveOrUpdate(Report report) {

    }

    @Override
    public void delete(Report report) {

    }
}
