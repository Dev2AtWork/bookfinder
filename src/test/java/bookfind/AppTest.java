package bookfind;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.net.URISyntaxException;

public class AppTest {

    @ParameterizedTest
    @ValueSource(strings = {"Two years in Calcutta",
            "Perumal Murugan rural",
            "Gail Honeyman",
            "Book based in Matunga 1990s",
            "Israeli historian 21st century",
            "dev patel australia"
    })

    public void firstDummyTest(String args) throws IOException, URISyntaxException {
        App.main(new String[]{args});
    }
}
