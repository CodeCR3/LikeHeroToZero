package country;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="worlddataco2")
public class Country implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id  @Column(name="id") int id;
	@Column(name="country_name") String countryName;
	@Column(name="country_code")private String countryCode;
	@Column(name="YR1990") private Double yr1990; 
	@Column(name="YR2000") private Double yr2000; 
	@Column(name="YR2014") private Double yr2014; 
	@Column(name="YR2015") private Double yr2015; 
	@Column(name="YR2016") private Double yr2016; 
	@Column(name="YR2017") private Double yr2017; 
	@Column(name="YR2018") private Double yr2018; 
	@Column(name="YR2019") private Double yr2019; 
	public Double getYr1990() {
		return yr1990;
	}

	public void setYr1990(Double yr1990) {
		this.yr1990 = yr1990;
	}

	public Double getYr2000() {
		return yr2000;
	}

	public void setYr2000(Double yr2000) {
		this.yr2000 = yr2000;
	}

	public Double getYr2014() {
		return yr2014;
	}

	public void setYr2014(Double yr2014) {
		this.yr2014 = yr2014;
	}

	public Double getYr2015() {
		return yr2015;
	}

	public void setYr2015(Double yr2015) {
		this.yr2015 = yr2015;
	}

	public Double getYr2016() {
		return yr2016;
	}

	public void setYr2016(Double yr2016) {
		this.yr2016 = yr2016;
	}

	public Double getYr2017() {
		return yr2017;
	}

	public void setYr2017(Double yr2017) {
		this.yr2017 = yr2017;
	}

	public Double getYr2018() {
		return yr2018;
	}

	public void setYr2018(Double yr2018) {
		this.yr2018 = yr2018;
	}

	public Double getYr2019() {
		return yr2019;
	}

	public void setYr2019(Double yr2019) {
		this.yr2019 = yr2019;
	}

	public Double getYr2020() {
		return yr2020;
	}

	public void setYr2020(Double yr2020) {
		this.yr2020 = yr2020;
	}

	public Double getYr2021() {
		return yr2021;
	}

	public void setYr2021(Double yr2021) {
		this.yr2021 = yr2021;
	}

	public Double getYr2022() {
		return yr2022;
	}

	public void setYr2022(Double yr2022) {
		this.yr2022 = yr2022;
	}

	public Double getYr2023() {
		return yr2023;
	}

	public void setYr2023(Double yr2023) {
		this.yr2023 = yr2023;
	}

	public Double getYr2024() {
		return yr2024;
	}

	public void setYr2024(Double yr2024) {
		this.yr2024 = yr2024;
	}

	@Column(name="YR2020") private Double yr2020; 
	@Column(name="YR2021") private Double yr2021; 
	@Column(name="YR2022") private Double yr2022; 
	@Column(name="YR2023") private Double yr2023; 
	@Column(name="YR2024") private Double yr2024;
	
	public Country() {
	}

	public Country(int id, String countryName, String countryCode) {
		/*this.id = id;
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.yr1990 = 2046.87;
		this.yr2000 = 1078.12;
		this.yr2014 = 9281.34;
		this.yr2015 = 10057.59;
		this.yr2016 = 9294.93;
		this.yr2017 = 10022.78;
		this.yr2018 = 10972.38;
		this.yr2019 = 11238.83;
		this.yr2020 = 8709.47;
		this.yr2021 = 9500.12;
		this.yr2022 = 10234.56;
		this.yr2023 = 11000.78;
		this.yr2024 = 11500.34;*/

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/*
	public double getYr1990() {
		return yr1990;
	}

	public void setYr1990(double yR1990) {
		this.yr1990 = yR1990;
	}

	public double getYr2000() {
		return yr2000;
	}

	public void setYr2000(double yR2000) {
		this.yr2000 = yR2000;
	}

	public double getYr2014() {
		return yr2014;
	}

	public void setYr2014(double yR2014) {
		this.yr2014 = yR2014;
	}

	public double getYr2015() {
		return yr2015;
	}

	public void setYr2015(double yR2015) {
		this.yr2015 = yR2015;
	}

	public double getYr2016() {
		return yr2016;
	}

	public void setYr2016(double yR2016) {
		this.yr2016 = yR2016;
	}

	public double getYr2017() {
		return yr2017;
	}

	public void setYr2017(double yR2017) {
		this.yr2017 = yR2017;
	}

	public double getYr2018() {
		return yr2018;
	}

	public void setYr2018(double yR2018) {
		this.yr2018 = yR2018;
	}

	public double getYr2019() {
		return yr2019;
	}

	public void setYr2019(double yR2019) {
		this.yr2019 = yR2019;
	}

	public double getYr2020() {
		return yr2020;
	}

	public void setYr2020(double yR2020) {
		this.yr2020 = yR2020;
	}

	public double getYr2021() {
		return yr2021;
	}

	public void setYr2021(double yR2021) {
		this.yr2021 = yR2021;
	}

	public double getYr2022() {
		return yr2022;
	}

	public void setYr2022(double yR2022) {
		this.yr2022 = yR2022;
	}

	public double getYr2023() {
		return yr2023;
	}

	public void setYr2023(double yR2023) {
		this.yr2023 = yR2023;
	}

	public double getYr2024() {
		return yr2024;
	}

	public void setYr2024(double yR2024) {
		this.yr2024 = yR2024;
	}*/
	
}
