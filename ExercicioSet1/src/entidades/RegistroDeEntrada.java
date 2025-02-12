package entidades;

import java.util.Date;
import java.util.Objects;

public class RegistroDeEntrada {

	private String username;
	private Date momento;

	public RegistroDeEntrada(String username, Date momento) {
		this.username = username;
		this.momento = momento;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroDeEntrada other = (RegistroDeEntrada) obj;
		return Objects.equals(username, other.username);
	}

}
