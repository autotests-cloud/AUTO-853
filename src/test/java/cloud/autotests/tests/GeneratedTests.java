package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Выбор поставщика для оплаты")
    void generatedTest() {
        step("Открыть https://vp.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("В окно для поиска ввести МТС, мобильная связь", () -> {
            step("// todo: just add selenium action");
        });

        step("Подтвердить выбор из выпадающего списка", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить что находимся на форме поставщика МТС, мобильная связь", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://vp.ru/'", () ->
            open("https://vp.ru/"));

        step("Page title should have text 'ВсеПлатежи - Оплата ЖКХ, штрафов, налогов, мобильной связи банковскими картами'", () -> {
            String expectedTitle = "ВсеПлатежи - Оплата ЖКХ, штрафов, налогов, мобильной связи банковскими картами";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://vp.ru/'", () ->
            open("https://vp.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}