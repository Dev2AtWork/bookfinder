package bookfind;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class App {
    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.println("hello World");
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        URIBuilder uriBuilder = new URIBuilder("https://www.googleapis.com/customsearch/v1");
        uriBuilder.addParameter("key", "AIzaSyBDaKOCQaadsnlVs7YtjHXykWklcO7lgDw")
                .addParameter("cx", "004520401497623145684:y7hamxrdiet")
                .addParameter("q", "Two years in Calcutta");
        HttpGet request = new HttpGet(uriBuilder.build());
        CloseableHttpResponse response = closeableHttpClient.execute(request);
        System.out.println(IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8.name()));
    }
}
