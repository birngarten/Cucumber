@US_001
Feature: US_001 Bir kullanici olarak ana sayfada "Seyahatin Tadını Çıkartın!" yazisini görebilmeliyim

  Scenario: TC_001 "Seyahatin Tadını Çıkartın!" yazisi görünür olmalidir
    Given kullanici "https://kese.nl" adresine gider
    Then kullanici seyahatin tadini cikartin yazisinin gorunur oldugunu dogrular
