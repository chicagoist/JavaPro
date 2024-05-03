package de.aittr.g_37_jp_shop.security.sec_dto;

import java.util.Objects;

public class TokenReponseDto {

    private String accesToken;
    private String refreshToken;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TokenReponseDto that = (TokenReponseDto) o;
        return Objects.equals(accesToken, that.accesToken) && Objects.equals(refreshToken, that.refreshToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accesToken, refreshToken);
    }

    public String getAccesToken() {
        return accesToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public TokenReponseDto(String accesToken, String refreshToken) {
        this.accesToken = accesToken;
        this.refreshToken = refreshToken;
    }

    @Override
    public String toString() {
        return "TokenReponseDto{" +
                "accesToken='" + accesToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }
}
