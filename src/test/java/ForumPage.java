import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class ForumPage {
    private SelenideElement welcomeForum = $x("//b[contains(text(),'Форум сайта Seventest')]");

    public void checkForumPage() {
        welcomeForum.shouldBe(Condition.visible, Duration.ofSeconds(30));
    }
}
