package com.cp.dma.javaopenweatherobjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RootObject {

private String cod;
private Double message;
private City city;
private Integer cnt;
private java.util.List<com.cp.dma.javaopenweatherobjects.List> list = new ArrayList<com.cp.dma.javaopenweatherobjects.List>();
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The cod
*/
public String getCod() {
return cod;
}

/**
* 
* @param cod
* The cod
*/
public void setCod(String cod) {
this.cod = cod;
}

/**
* 
* @return
* The message
*/
public Double getMessage() {
return message;
}

/**
* 
* @param message
* The message
*/
public void setMessage(Double message) {
this.message = message;
}

/**
* 
* @return
* The city
*/
public City getCity() {
return city;
}

/**
* 
* @param city
* The city
*/
public void setCity(City city) {
this.city = city;
}

/**
* 
* @return
* The cnt
*/
public Integer getCnt() {
return cnt;
}

/**
* 
* @param cnt
* The cnt
*/
public void setCnt(Integer cnt) {
this.cnt = cnt;
}

/**
* 
* @return
* The list
*/
public java.util.List<com.cp.dma.javaopenweatherobjects.List> getList() {
return list;
}

/**
* 
* @param list
* The list
*/
public void setList(java.util.List<com.cp.dma.javaopenweatherobjects.List> list) {
this.list = list;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}