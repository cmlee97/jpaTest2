package kr.ezen.jpademo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Customer {
    @Id
//    @GeneratedValue
    private String id;
    private String password;
    private String name;
    private String email;
    private Date inDate;
    private Date upDate;
}
