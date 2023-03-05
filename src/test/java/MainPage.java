import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement forum = $("[title='Форум для зарегистрированных пользователей Seventest']");

    public ForumPage entranceForum() {
        forum.click();
        return new ForumPage();

    }
}
