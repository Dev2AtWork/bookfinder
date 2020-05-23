package bookfind.client;

import bookfind.domain.config.ConfigurationDTO;
import data.QueryEnums;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.HashMap;

import static bookfind.client.SearchClientImpl.searchClient;
import static bookfind.utility.BookFilterUtils.filterResponse;
import static bookfind.utility.YamlUtils.CONFIG_SUPPLIER;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchClientImplTest {
    @ParameterizedTest
    @EnumSource(QueryEnums.class)
    @DisplayName("should return book names as expected")
    void shouldReturnCorrectBookName(QueryEnums queryEnum) {
        ConfigurationDTO configurationDTO = CONFIG_SUPPLIER.get();
        assertEquals(queryEnum.getBookName(),
                searchClient.andThen(filterResponse).apply(new HashMap<String, String>() {{
                    put("api.key", configurationDTO.key());
                    put("api.cx", configurationDTO.cx());
                    put("api.q", queryEnum.getQuery());
                }}).name(), String.format("validating for query string :: %s", queryEnum.getQuery()));
    }
}
