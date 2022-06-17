import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        // Инициализируй поля класса в конструкторе
        this.age = age;
        this.result = result;
    }

    // Пометь метод аннотацией для параметров
    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {17, false},
                {18, true},
                {19, true},
                {21, true}
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        AgeChecker ageChecker = new AgeChecker();
        // Передай сюда возраст пользователя
        boolean isAdult = ageChecker.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("Ожижаемый и фактический результат должны совпадать", result, isAdult);
    }
}

