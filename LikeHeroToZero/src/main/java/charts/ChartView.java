package charts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.primefaces.model.charts.*;
import org.primefaces.model.charts.line.*;
import org.primefaces.model.charts.optionconfig.title.Title;

import country.Country;
import hibernate.DBConnectionManager;
import jakarta.annotation.PostConstruct;





public class ChartView implements Serializable{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LineChartModel lineModel;
	  private List<Country> countryList;
	  private ChartData data;
	  //private DBConnectionManager dbcon;
	  private LineChartDataSet dataSet;
	  private List<String> labels;
	  private LineChartOptions options;
	  private String defaultCountry;
	 
	    
	    public ChartView(Collection<Country> countryList) {
	    	System.out.println("CV Konstruktor...");
	    	defaultCountry = "POL";
	    	this.countryList = (List<Country>) countryList;
	    	
	    	//loadChartFromDB();
	    	lineModel = new LineChartModel();
	    	//dbcon = new DBConnectionManager();
	    	//countryList = (List<Country>) dbcon.getAllCountries();
	    	
	    	
	      
	    	 
	    	options  = new LineChartOptions();        
	        Title title = new Title();
	        title.setDisplay(true);
	        title.setText("WORLD Co2 EMISSION");
	        options.setTitle(title);
	        lineModel.setOptions(options);
	        
	        loadChartFromDB(defaultCountry); 
		}
	    
	    @PostConstruct
	    public void init() {
	    	System.out.println("ChartView POST");  
	    }
	    
	    public LineChartModel getLineModel() {  
	    	//loadChartFromDB();
	    	return lineModel; 
	    }
	    
	    public void setDefaultCountry(String country) {  
	    	this.defaultCountry = country;
	    }
	    
	    public void loadChartFromDB(String country) {
	    	
	    	System.out.println("loadChart: " + country);
	        if(countryList != null) {
		    	for(int i=0;i<countryList.size();i++) {
		    		if(countryList.get(i).getCountryCode().equals(country)) {
		    			//||countryList.get(i).getCountryCode().equals(c2))
		    		    List<Object> values = new ArrayList<>();
		    	        values.add(countryList.get(i).getYr1990());
		    	        values.add(countryList.get(i).getYr2000());
		    	        values.add(countryList.get(i).getYr2015());
		    	        
		    	        values.add(countryList.get(i).getYr2021());
		    	        values.add(countryList.get(i).getYr2022());
		    	        values.add(countryList.get(i).getYr2023());
		    	        
		    	        dataSet = new LineChartDataSet();
		    	        dataSet.setFill(false);
		    	        dataSet.setBorderColor("rgb("+(75)+","+(192)+","+(192)+")");
		    	        dataSet.setLineTension(0.3);
		    	        dataSet.setData(values);
		    	        dataSet.setLabel(countryList.get(i).getCountryName());
		    	        

		    	        data = new ChartData();   	
					    	labels = new ArrayList<>();
					        labels.add("1990");
					        labels.add("2000");
					        labels.add("2015");
					        labels.add("2021");
					        labels.add("2022");
					        labels.add("2023");   
				        data.setLabels(labels);
			        
		    	        data.addChartDataSet(dataSet);
		            
		    	        lineModel.setData(data);    
		    	        break;
		    		}
		    	}
	        } else {
	        	System.out.println("FA!LED LOADING DATA FROM DATABASE...");
	        }
	    }
	    
	   /* public void updateLineModel(String country) { 
	    	System.out.println("updateChart: " + country);
	    	this.defaultCountry = country;
	    	
	    	for(int i=0;i<countryList.size();i++) {
	    		if(countryList.get(i).getCountryCode().equals(country)) {
	    			
	    			//dataSet = new LineChartDataSet();
	    		    List<Object> values = new ArrayList<>();
	    	        values.add(countryList.get(i).getYr1990());
	    	        values.add(countryList.get(i).getYr2000());
	    	        values.add(countryList.get(i).getYr2015());
	    	        values.add(countryList.get(i).getYr2021());
	    	        values.add(countryList.get(i).getYr2022());
	    	        values.add(countryList.get(i).getYr2023());
      
	    	        dataSet.setData(values);
	    	        dataSet.setFill(false);
	    	        dataSet.setLabel(countryList.get(i).getCountryName());
	    	        dataSet.setBorderColor("rgb("+(75)+","+(192)+","+(192)+")");
	    	        dataSet.setLineTension(0.1);
	    	        data.addChartDataSet(dataSet);	  
	    	        lineModel.setData(data);	
	    	        break;
	    		}
	    		
	    		//PrimeFaces.current().ajax().update("formid:chartOutput"); https://stackoverflow.com/questions/25339056/understanding-primefaces-process-update-and-jsf-fajax-execute-render-attributes
    	}	
	}*/
 }
