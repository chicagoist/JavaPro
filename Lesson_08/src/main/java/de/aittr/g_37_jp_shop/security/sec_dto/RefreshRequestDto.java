package de.aittr.g_37_jp_shop.security.sec_dto;

import java.util.Objects;

public class RefreshRequestDto {

    private String refreshToken;

    public String getRefreshToken() {
        return refreshToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RefreshRequestDto that = (RefreshRequestDto) o;
        return Objects.equals(refreshToken, that.refreshToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refreshToken);
    }

    @Override
    public String toString() {
        return "RefreshRequestDto{" +
                "refreshToken='" + refreshToken + '\'' +
                '}';
    }
}
