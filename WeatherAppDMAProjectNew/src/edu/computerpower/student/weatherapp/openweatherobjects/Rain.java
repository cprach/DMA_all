package edu.computerpower.student.weatherapp.openweatherobjects;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Rain {

	@SerializedName("3h")
	private double _3h;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return
	 * The _3h
	 */
	public double get3h() {
		return _3h;
	}

	/**
	 * 
	 * @param _3h
	 * The 3h
	 */
	public void set3h(double _3h) {
		this._3h = _3h;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}