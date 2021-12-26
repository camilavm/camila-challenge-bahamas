package com.challenge.bahamas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private Long id;
		
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String code;
	
	private String email;
	private String language;
	private String address;
	private String city;
	private String postal_code;
	private String country;
	private String fiscal_id;
	private String website;
	private String phone;
	private String fax;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	private PreferredContact preferred_contact;
	
	private String observations;
	private String send_options;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="client_invoice",
				joinColumns={@JoinColumn(name="client_id")},
				inverseJoinColumns={@JoinColumn(name="invoice_id")})
	private List<Invoice> invoiceList;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFiscal_id() {
		return fiscal_id;
	}
	public void setFiscal_id(String fiscal_id) {
		this.fiscal_id = fiscal_id;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public PreferredContact getPreferred_contact() {
		return preferred_contact;
	}
	public void setPreferred_contact(PreferredContact preferred_contact) {
		this.preferred_contact = preferred_contact;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	public String getSend_options() {
		return send_options;
	}
	public void setSend_options(String send_options) {
		this.send_options = send_options;
	}	
	public List<Invoice> getInvoiceList() {
		return invoiceList;
	}
	public void setInvoiceList(List<Invoice> invoiceList) {
		this.invoiceList = invoiceList;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
