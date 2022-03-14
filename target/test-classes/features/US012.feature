@US_12
Feature: US_012 Bir kullanici olarak "/login" sayfasina girdigimde, sifremi unuttum bölümüne ulasabilmeliyim

  Background:
    Given kullanici "https://kese.nl/login" adresine gider

  Scenario:TC_001	"Şifremi Unuttum" linki aktif ve görünür olmalidir
    Then kullanici "Şifremi Unuttum" linkinin aktif ve görünür oldugunu dogrular

  Scenario:TC_002	"Şifremi Unuttum" linkinin alti cizili olmalidir
    Then kullanici "Şifremi Unuttum" linkinin alti cizili oldugunu dogrular

  Scenario:   TC_003	Linke tiklaninca "https://kese.nl/forgot_password" sayfasina gidilmelidir
    And kullanici "Şifremi Unuttum" linkine tiklar
    Then kullanici sayfa adresinin "/forgot_password" ifadesini icerdigini dogrular


