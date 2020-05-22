package bookfind.client;

import bookfind.domain.search.ResponseDomainDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.function.Function;

public final class SearchClientImpl {
    public static Function<String[], ResponseDomainDTO> searchClient = (args) -> {
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        URIBuilder uriBuilder = null;
        try {
            uriBuilder = new URIBuilder("https://www.googleapis.com/customsearch/v1");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
        uriBuilder.addParameter("key", args[0])
                .addParameter("cx", args[1])
                .addParameter("q", args[2]);
        HttpGet request = null;
        try {
            request = new HttpGet(uriBuilder.build());
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
        CloseableHttpResponse response = null;
        try {
            response = closeableHttpClient.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        ResponseDomainDTO responseDomainDTO = null;
        try {
            responseDomainDTO = objectMapper.
                    readValue(response.getEntity().getContent(),
                            ResponseDomainDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        try {
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        try {
            closeableHttpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseDomainDTO;
    };
}
