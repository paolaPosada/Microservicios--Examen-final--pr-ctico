package co.edu.udea.microserviciosudearegistration.api;

import co.edu.udea.microserviciosudearegistration.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {
    @GetMapping(value="/contact")
    public String createUser() throws JsonProcessingException {
        User contact = new User(1001242646, "Paola", "Posada",
                "+57 317 495 05 88","paola.posada1@udea.edu.co");
        ObjectMapper mapper = new ObjectMapper();
        String convertJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(contact);
        return convertJson;
    }
    //public User createUser(){
    // User contact = new User(1001242646, "Paola", "Posada",
    // "+57 317 495 05 88","paola.posada1@udea.edu.co");
    //  return contact;
    //   }

}
