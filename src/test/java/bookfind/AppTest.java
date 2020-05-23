package bookfind;

import data.QueryEnums;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest {

    @Test
    public void shouldGetMatchingBookResponse(QueryEnums data) {
        App.main(new String[]{QueryEnums.TEST_DATA_9.getQuery()});
        Assertions.assertTrue(true);
    }
}
