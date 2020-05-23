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
import java.util.HashMap;
import java.util.function.Function;

import static bookfind.utility.YamlUtils.CONFIG_SUPPLIER;

public final class SearchClientImpl {
    public static Function<HashMap<String, String>, ResponseDomainDTO> searchClient = (args) -> {
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        URIBuilder uriBuilder = null;
        try {
            uriBuilder = new URIBuilder(CONFIG_SUPPLIER.get().url());
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
        uriBuilder.addParameter("key", args.get("api.key"))
                .addParameter("cx", args.get("api.cx"))
                .addParameter("q", args.get("api.q"));
        HttpGet request;
        try {
            request = new HttpGet(uriBuilder.build());
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
        CloseableHttpResponse response;
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
