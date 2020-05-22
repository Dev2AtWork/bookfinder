package bookfind.processor;

import bookfind.domain.response.AppResponseDTO;

import java.util.function.Function;

import static bookfind.client.SearchClientImpl.searchClient;
import static bookfind.utility.BookFilter.filterResponse;
import static java.lang.Boolean.TRUE;

public final class BookFindProcessor {
    public static Function<String[], Boolean> findBookByString = (args)->  {
        AppResponseDTO returnValue = searchClient.andThen(filterResponse).apply(args);

        System.out.println(String.format("Are you looking for %s? " +
                        "Here's the link for the book : %s",
                returnValue.name(), returnValue.link()));
        return TRUE;
    };
}
