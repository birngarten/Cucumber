@US_010
Feature: US_010

  Background:
    Given kullanici "https://kese.nl/login" adresine gider
  Scenario: TC_001 Email inputu kullanilabilir olmalidir
    Then kullanici login sayfasinda email inputunun kullanilabilir oldugunu dogrular

  Scenario: TC_002	Sifre inputu kullanilabilir olmalidir
    Then kullanici login sayfasinda password inputunun kullanilabilir oldugunu dogrular

  Scenario: TC_003	Email inputu "Placeholder" degeri "Email giriniz" olmalidir
    Then kullanici login sayfasinda email inputunun placeholder degerinin "Email giriniz" oldugunu dogrular

  Scenario: TC_004	Sifre inputu "Placeholder" degeri "Şifrenizi giriniz" olmalidir
    Then kullanici login sayfasinda password inputunun placeholder degerinin "Şifrenizi giriniz" oldugunu dogrular