package it.oshift.colorsbe;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("colors_be")
@RestController()
public class ColorsBEController {
	
	@Autowired
	private SceltaRepository sceltaRepository;

	@RequestMapping(value = "/getColor", method = RequestMethod.GET,produces={"application/json"})
	public ResponseEntity getColor() throws Exception {
		JSONObject jsonResp=new JSONObject();
		jsonResp.put("choosed_color", "verde smeraldo");
		return new ResponseEntity(jsonResp.toString(),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/saveColor", method = RequestMethod.POST,produces={"application/json"})
	//public ResponseEntity saveColor(@RequestParam(name = "color") String color) throws Exception {
	public ResponseEntity saveColor(@RequestBody  String jsonColor) throws Exception {
	
		JSONObject jsonObject=new JSONObject(jsonColor);
		String colore =(String) jsonObject.get("color");
		
		//save the color on DB and return OK
		System.out.println("ColorsBE Controller.saveColor sto per salvare sul DB");
		Scelta scelta=new Scelta();
		scelta.setColore(colore);
		sceltaRepository.save(scelta);
		System.out.println("ColorsBE Controller.saveColor ho salvato sul DB");
		
		
		//String color="fddfsdfssd";
		System.out.println("Colors BE saving color:"+colore);
		
		JSONObject jsonResp=new JSONObject();
		return new ResponseEntity("OK",HttpStatus.OK);
	}
	
}
