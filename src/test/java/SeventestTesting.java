import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SeventestTesting {
    @BeforeEach
    void setUp() {
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void autoTestSeventest() {
        open("http://www.seventest.com/");
        new MainPage()
                .entranceForum();
        new ForumPage()
                .checkForumPage();


    }
}