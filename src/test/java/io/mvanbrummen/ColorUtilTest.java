package io.mvanbrummen;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.awt.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class ColorUtilTest {

    @ParameterizedTest
    @ValueSource(strings = {"05131D", "#FEBABD", "#FFFFFF", "#FFF", "FF"})
    void shouldReturnColorWhenValidHexIsValid(String hex) {
        assertThat(ColorUtil.hexToColor(hex)).isNotNull();
    }

    @Test
    void shouldThrowIllegalArgumentWhenHexIsNotValid() {
        assertThatIllegalArgumentException().isThrownBy(() -> ColorUtil.hexToColor("jksdfds99"));
    }

    @Test
    void shouldReturnDistanceWhenValidColors() {
        assertThat(ColorUtil.colorDistance(Color.CYAN, Color.BLACK)).isEqualTo(674.477575609449);
    }
}