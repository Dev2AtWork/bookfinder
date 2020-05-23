package bookfind.utility;

import bookfind.domain.config.ConfigurationDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.function.Supplier;

public final class YamlUtils {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper(new YAMLFactory());
    public static String CONFIG_PROP_YAML = String.format("%s/src/main%s",System.getProperty("user.dir"),
            "/resources/application-config.yml");

    public static Supplier<ConfigurationDTO> CONFIG_SUPPLIER = () ->
    {
        try {
            return OBJECT_MAPPER.readValue(new File(CONFIG_PROP_YAML), ConfigurationDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    };
}
