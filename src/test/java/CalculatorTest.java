import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{{10, 2640}, {100, 25164150}, {-100, 25164150}};
    }

    @Test(dataProvider = "getData")
    public void testCalculateTax(int input, long output) {

        //Arrange
        //Act
        long calculatedSquare = Calculator.calculateSquares(input);
        //Assert
        assertThat(calculatedSquare).isEqualTo(output);
    }
}
