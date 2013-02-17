package jenalod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.rdf.model.Model;

/**
 * @author amitjain
 *
 */



public class PersistLODdata {

    String outputFilePath;
    FileWriter fwriter;

    public void importData(String queryStr, String servicePt, String outfilepath) throws IOException {


        FileWriter fostream = new FileWriter(outfilepath);
        BufferedWriter out = new BufferedWriter(fostream);

        QueryExecution qexec = QueryExecutionFactory.sparqlService(servicePt, queryStr);

        Model results = qexec.execConstruct();
        results.write(out, "TURTLE");


        qexec.close();

    }
}
