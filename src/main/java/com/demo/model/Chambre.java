package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Chambre {
@Id
private int identifiant;

private String emplacement;
@Column(nullable = false)
@Min(value = 0)
private int etage;
@Column(nullable = false)
private String type;
@Column(unique = true)
@NotBlank
private String proprietaire;
public int getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(int identifiant) {
	this.identifiant = identifiant;
}
public String getEmplacement() {
	return emplacement;
}
public void setEmplacement(String emplacement) {
	this.emplacement = emplacement;
}
public int getEtage() {
	return etage;
}
public void setEtage(int etage) {
	this.etage = etage;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getProprietaire() {
	return proprietaire;
}
public void setProprietaire(String proprietaire) {
	this.proprietaire = proprietaire;
}
public Chambre(int identifiant, String emplacement, @Min(0) int etage, String type, @NotBlank String proprietaire) {
	super();
	this.identifiant = identifiant;
	this.emplacement = emplacement;
	this.etage = etage;
	this.type = type;
	this.proprietaire = proprietaire;
}
public Chambre() {
	super();
	// TODO Auto-generated constructor stub
}




}
