package org.hibernate.bugs;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@DynamicUpdate
@Entity
@Table(name = "ENTITY_A")
public class EntityA {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	Integer id;

	@Column(name = "PROPERTY_A")
	int propertyA;

	@Column(name = "PROPERTY_B")
	int propertyB;
}