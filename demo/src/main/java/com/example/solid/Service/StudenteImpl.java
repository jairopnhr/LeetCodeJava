package com.example.solid.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import javax.management.relation.Role;

import com.example.solid.dao.StudentsDao;
import com.example.solid.database.DatabaseConfig;
import com.example.solid.model.SchoolSubject;
import com.example.solid.model.Student;
import com.example.solid.model.User;

public class StudenteImpl implements StudentsDao<SchoolSubject> {

    private Connection connection;

    public StudenteImpl() {
        this.connection = DatabaseConfig.getInstance().connection();
    }

    @Override
    public void save(Student user) {
        String sql = "INSERT INTO student (username, password, registration) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getRegistration());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveAll(List<Student> students) {
        String sql = "INSERT INTO student (username, password, registration) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            for (User user : students) {
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getPassword());
                statement.setString(3, user.getRegistration());
                statement.addBatch();
            }
            statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Student user) {
        String sql = "UPDATE student SET username = ?, password = ?, registration = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getRegistration());
            statement.setLong(4, user.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean existsUserById(Long id) {
        String sql = "SELECT COUNT(*) FROM students WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            return statement.executeQuery().next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean existsUserByName(String name) {
        String sql = "SELECT COUNT(*) FROM students WHERE username = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            return statement.executeQuery().next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean existsUserByEmail(String email) {
        // Implement similar to existsUserByName
        return false; // Placeholder
    }

    @Override
    public void deleteById(Long id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAll() {
        String sql = "DELETE FROM users";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUsersByRole(Role role) {
        // Implement if roles are stored in users table
    }

    @Override
    public Student findUserById(Long id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            var resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Student(
                        resultSet.getLong("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("registration")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Student findUserByEmail(String email) {
        // Implement similar to findUserById
        return null; // Placeholder
    }

    @Override
    public List<Student> findUsersByName(String name) {
        // Implement query to find users by name
        return null; // Placeholder
    }

    @Override
    public List<Student> findUsersByRole(Role role) {
        // Implement query to find users by role
        return null; // Placeholder
    }

    @Override
    public List<Student> findUsersCreatedAfter(LocalDate date) {
        // Implement query to find users created after a date
        return null; // Placeholder
    }

    @Override
    public List<Student> findAll() {
        // Implement query to find all users
        return null; // Placeholder
    }

    @Override
    public List<Student> findAll(int page, int size) {
            return null; // Placeholder
    }

    @Override
    public List<Student> findAllSortedByName() {
       
        return null; // Placeholder
    }

    @Override
    public long count() {
        String sql = "SELECT COUNT(*) FROM users";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            var resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void saveStudentsInSchoolSubject(Student student, SchoolSubject subject) {
        String sql = "INSERT INTO student_subjects (student_id, subject_id) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, student.getId());
            statement.setLong(2, subject.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveGradeStudents(List<Double> grades, SchoolSubject subject) {
        String sql = "INSERT INTO grades (student_id, activity_id, grade) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            for (Double grade : grades) {
   
                int studentId = 1; 
                int activityId = 1; 
                
                statement.setInt(1, studentId);
                statement.setInt(2, activityId);
                statement.setDouble(3, grade);
                statement.addBatch();
            }
            statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
