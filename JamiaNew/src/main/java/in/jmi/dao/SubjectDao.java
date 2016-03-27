package in.jmi.dao;

import in.jmi.model.Subject;

import java.util.List;

public interface SubjectDao {
	public Subject save(Subject subject);
	public Subject update(Subject subject);
	public void delete(Subject subject);
	public Subject findOne(long subjectId);
	public List<Subject> findAll();


}
