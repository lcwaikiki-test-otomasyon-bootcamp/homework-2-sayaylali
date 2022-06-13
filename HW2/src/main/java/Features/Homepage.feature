Feature: Sahibinden Home Page

  Scenario:Check whether the sort by price button show the maximum price

    Given Homepage opens
    When Click Konut on Emlak List
    When Check Searchpage opens
    When Click Satilik combobox
    When Click Kiralik on combobox
    When Write "4000" on Max TL textbox
    When Click Ara button
    Then Check Resultpage opens
    When Click Il combobox
    When Filter and select "Izmir"
    When Click Filter Ara button
    Then Check Resultpage updated
