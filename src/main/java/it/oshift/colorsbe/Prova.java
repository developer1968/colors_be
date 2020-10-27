package it.oshift.colorsbe;

import org.json.JSONObject;

public class Prova {

	public static void main(String[] args) {
		String json="{\"color\":\"bianco\"}";
		
		JSONObject jsonObject=new JSONObject(json);
		String colore =(String) jsonObject.get("color");
		System.out.println(colore);

	}

}
