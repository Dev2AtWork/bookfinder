package bookfind.processor;

import bookfind.domain.response.AppResponseDTO;

import java.util.HashMap;
import java.util.function.Function;

import static bookfind.client.SearchClientImpl.searchClient;
import static bookfind.utility.BookFilterUtils.filterResponse;

public final class BookFindProcessor {
    public static Function<HashMap<String, String>, AppResponseDTO> findBookByString = (args) ->
            searchClient.andThen(filterResponse).apply(args);
}
