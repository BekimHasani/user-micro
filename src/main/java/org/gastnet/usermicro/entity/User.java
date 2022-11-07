package org.gastnet.usermicro.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.gastnet.usermicro.enumeration.Role;
import org.gastnet.usermicro.enumeration.UserState;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//@Aggregate
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="`User`")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@AggregateIdentifier
	private Long userId;
	
	@Column(nullable = false , unique = true)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date creationDate;
	
	@Column(nullable = false)
	private boolean status;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Role role;
	
	private UserState userState;
	
	@OneToMany(mappedBy = "user")
	@JsonIgnore
	private Set<Report> reports = new HashSet<>();
	
	@Column(nullable = false) //columnDefinition = "SMALLINT(1) DEFAULT 0")
	private Boolean googleUser;
	
}
	
