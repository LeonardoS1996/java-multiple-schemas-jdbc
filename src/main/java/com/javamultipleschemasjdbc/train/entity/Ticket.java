package com.javamultipleschemasjdbc.train.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Ticket {
	
	private Long id;
	
	private BigDecimal price;

	public Ticket() {}

	public Ticket(Long id, BigDecimal price) {
		this.id = id;
		this.price = price;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Ticket)) return false;
		Ticket ticket = (Ticket) o;
		return Objects.equals(getId(), ticket.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Ticket{");
		sb.append("id=").append(id);
		sb.append(", price=").append(price);
		sb.append('}');
		return sb.toString();
	}
}
