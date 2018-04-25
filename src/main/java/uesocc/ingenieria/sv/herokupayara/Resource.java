/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.ingenieria.sv.herokupayara;

import java.io.Serializable;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author kevin
 */
@Path("test")
public class Resource implements Serializable {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String saludar() {
        System.out.println("NO FUNCIONA AMIGUITO");
        return "success";
    }

    /**
     *
     * @param opcion
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String json(
            @QueryParam("opcion") int opcion) {
        System.out.println(" FUNCIONA AMIGUITO");

        if (opcion == 1) {
            return "{\n"
                    + "    \"glossary\": {\n"
                    + "        \"title\": \"example glossary\",\n"
                    + "		\"GlossDiv\": {\n"
                    + "            \"title\": \"S\",\n"
                    + "			\"GlossList\": {\n"
                    + "                \"GlossEntry\": {\n"
                    + "                    \"ID\": \"SGML\",\n"
                    + "					\"SortAs\": \"SGML\",\n"
                    + "					\"GlossTerm\": \"Standard Generalized Markup Language\",\n"
                    + "					\"Acronym\": \"SGML\",\n"
                    + "					\"Abbrev\": \"ISO 8879:1986\",\n"
                    + "					\"GlossDef\": {\n"
                    + "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\n"
                    + "						\"GlossSeeAlso\": [\"GML\", \"XML\"]\n"
                    + "                    },\n"
                    + "					\"GlossSee\": \"markup\"\n"
                    + "                }\n"
                    + "            }\n"
                    + "        }\n"
                    + "    }\n"
                    + "}";
        } else {
            return "nepe";
        }
    }
}
