import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class AvitoTestWithSteps {

    @Test
    void avitoTestPorsche() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.addModelCar();
        steps.clickNewModification();
        steps.checkResult();
    }
}
