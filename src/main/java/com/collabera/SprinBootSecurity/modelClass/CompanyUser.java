package com.collabera.SprinBootSecurity.modelClass;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;


@Data
@Entity

public class CompanyUser extends AuditModel implements Serializable {

	
private static final long serialVersionUID = -6603226864656528349L;
	
	public static final String ROLE_MANAGER = "MANAGER";
    public static final String ROLE_EMPLOYEE = "EMPLOYEE";
 
    @Column(name = "Active", length = 1, nullable = true)
    private boolean active;
 
    @Column(name = "User_Role", length = 20, nullable = true)
    private String userRole;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @Column(nullable = false, unique = true, length = 45)
    private String email;
     
    @Column(nullable = false, length = 64)
    private String password;
     
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;
     
    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Departments depatments;

	public CompanyUser(boolean active, String userRole, Long id, String email, String password, String firstName,
			String lastName, Departments depatments) {
		super();
		this.active = active;
		this.userRole = userRole;
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.depatments = depatments;
	}
    public CompanyUser() {
		// TODO Auto-generated constructor stub
	}
    
}
