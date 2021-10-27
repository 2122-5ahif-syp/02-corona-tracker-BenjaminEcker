package at.htl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Entity(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private String telephoneNo;

    private Instant timestamp;

    public Person() {
    }

    public Person(String firstName, String lastName, String email, String telephoneNo, Instant timestamp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephoneNo = telephoneNo;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNo='" + telephoneNo + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
