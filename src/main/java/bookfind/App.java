package bookfind;

import bookfind.domain.config.ConfigurationDTO;
import bookfind.domain.response.AppResponseDTO;

import java.util.HashMap;

import static bookfind.processor.BookFindProcessor.findBookByString;
import static bookfind.utility.YamlUtils.CONFIG_SUPPLIER;

public class App {

    public static void main(String[] args) {
        ConfigurationDTO configurationDTO = CONFIG_SUPPLIER.get();
        AppResponseDTO responseDTO = findBookByString
                .apply(new HashMap<String, String>() {{
                    put("api.key", configurationDTO.key());
                    put("api.cx", configurationDTO.cx());
                    put("api.q", System.getProperty("api.q"));
                }});
        System.out.println(String.format("Are you looking for %s? " +
                        "Here's the link for the book : %s",
                responseDTO.name(), responseDTO.link()));
    }
}
