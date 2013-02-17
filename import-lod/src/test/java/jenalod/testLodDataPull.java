package jenalod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;



public class testLodDataPull {

    @Test(groups= {"dbpedia"})

    public void test() throws IOException {
//        List<String> conditions = new ArrayList<String>();
        String outputPath = "src/test/resources/files/results.owl";

//        String condition
        String queryStr =" CONSTRUCT { ?s ?p ?o } " +
                " WHERE { ?s ?p ?o . " +
                " ?s <http://purl.org/dc/terms/subject> <http://dbpedia.org/resource/Category:French_films> . " +
                "}" +
                "LIMIT 10" ;

        String servicePt="http://dbpedia.org/sparql";


        PersistLODdata pld = new PersistLODdata();
        pld.importData(queryStr,servicePt, outputPath);
//        Assert.assertTrue(false, "");
    }

}
