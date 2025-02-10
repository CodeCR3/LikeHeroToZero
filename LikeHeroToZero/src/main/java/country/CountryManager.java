package country;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import jakarta.inject.Named;
//import javax.faces.view.ViewScoped;

import org.primefaces.model.charts.line.LineChartModel;

import charts.ChartView;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
//import jakarta.inject.Named;
import hibernate.*;


@Named
//@ViewScoped
@SessionScoped
public class CountryManager implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Collection<Country> countryList = new ArrayList<Country>();
	private String selectedCountry;
	
	
	private ChartView chartView;
	//private LineChartModel lineChartModel;

	public CountryManager() {
	}
	
	@PostConstruct
	public void init() {
		System.out.println("CM Initialzed...");
		DBConnectionManager dbCon = new DBConnectionManager();
		countryList = dbCon.getAllCountries();	
		//lineChartModel = new LineChartModel();
		chartView = new ChartView(countryList);
	}
	
	public LineChartModel getLineChartModel() {
		return chartView.getLineModel();
	}


	public void setSelectedCountry(String selectedCountry) {
		this.selectedCountry = selectedCountry;
	}
	
	public String getSelectedCountry() {
		return selectedCountry;
	}

	public Collection<Country> getCountryList() {
		return countryList;
	}
	
	public LineChartModel lineModel() {
		System.out.println("geLine " + selectedCountry);
		return chartView.getLineModel();
	}
	
	public void updateChart() {
		chartView.loadChartFromDB(selectedCountry);
		//return chartView.getLineModel();
	}
	
	
}
