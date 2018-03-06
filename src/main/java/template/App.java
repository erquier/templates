package template;

import static spark.Spark.*;


import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class App {
    public static void main(String[] args) {
        get("/hello", (req, res) -> {
        	res.redirect("/home");
        	return null;
        });
        
        
        get("/home",(req, res)->{
        	Map<String, Object> model = new HashMap<>();
        	User user = new User("Ernesto", "Santana");
        	model.put("user", user);
        	model.put("titulo","titulo de mi pagina" );
        	return new ModelAndView(model, "home.ftl");
        }, new FreeMarkerEngine());
        
        post("/contacto", (req, res)->{
        	
        	Map<String, Object> model = new HashMap<>();
        	String Name = req.queryParams("Name");
        	String Email = req.queryParams("Email");
        	String Message = req.queryParams("Message");
        	        	
        	Contactos form = new Contactos(Name, Email, Message);
        	Contactos usuarioEnSession = req.session().attribute("usuario");
        	if (usuarioEnSession == null) { 
        		req.session().attribute("usuario", form);
        	} else { 
        		req.session().attribute("usuario2", form);
        	}
        	
        	return new ModelAndView(model, "contacto.ftl");
        }, new FreeMarkerEngine());
    
    }
}