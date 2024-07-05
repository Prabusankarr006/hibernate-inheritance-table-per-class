package com.use;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="trainee1")
public class Trainee1  extends Employee1{
float payperhour;
String contractperiod;




public Trainee1( String name, float payperhour, String contractperiod) {
	super( name);
	this.payperhour = payperhour;
	this.contractperiod = contractperiod;
}
public float getPayperhour() {
	return payperhour;
}
public void setPayperhour(float payperhour) {
	this.payperhour = payperhour;
}
public String getContractperiod() {
	return contractperiod;
}
public void setContractperiod(String contractperiod) {
	this.contractperiod = contractperiod;
}

}
