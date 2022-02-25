package com.br.nff.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.br.nff.entities.enums.OrderStatus;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer orderStatus;	
	private Instant moment;
	
	@OneToMany(mappedBy = "id.order")
	private Set<OrderItem> items = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Users client;

	public Order() {

	}

	public Order(Long id, Instant moment, OrderStatus ordeStatus, Users client) {
		super();
		setOrdeStatus(ordeStatus);
		this.id = id;
		this.moment = moment;
		this.client = client;
	}
	
	public OrderStatus getOrdeStatus() {
		return OrderStatus.valueOf(orderStatus);
	}

	public void setOrdeStatus(OrderStatus ordeStatus) {
		if(ordeStatus != null) {
			this.orderStatus = ordeStatus.getCode();
		}	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	

	public Users getClient() {
		return client;
	}

	public void setClient(Users client) {
		this.client = client;
	}
	
	public Set<OrderItem> getOrder(){
		return items;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}

}
