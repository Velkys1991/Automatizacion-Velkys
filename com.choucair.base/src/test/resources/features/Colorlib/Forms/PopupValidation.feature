#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Formulario Popup Validation
  El Usuario debe poder ingresra al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longuitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través un globo informativo.
  

 # @CasoExitoso
  #Scenario: Digilenciamiento exitoso del formulario Popup Validation,
           # no se presenta ningun mensaje de validación.
    #Given Auntentico en colorlib con usuario "demo" y clave "demo"
    #And Ingreso a funcionalidad Forms Validation
    #When Diligencio Formulario Popup Validation
   # | Requerid | Select | MultipleS1|MultipleS2|Url                   |Email          | Password1 |Passwor2|Minsize|Maxsize|Number|IP         |Date      |DateEarlier| 
   # | Valor1   |Golf    |Tennis     |Golf      |https://www.valor1.com |valor1@mail.com|valor1     |valor1  |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 |
   # Then Verifico ingreso exitoso
 

 @CasoAlterno
  Scenario: Digilenciamiento con errores del formulario Popup Validation,
            Se presenta globo informativo indicando error en el diligenciamiento de alguno de los campos.
    Given Auntentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a funcionalidad Forms Validation
    When Diligencio Formulario Popup Validation
   | Requerid | Select | MultipleS1|MultipleS2|Url                   |Email          | Password1 |Passwor2|Minsize|Maxsize|Number|IP         |Date      |DateEarlier| 
   | |Golf    |Tennis     |Golf      |https://www.valor1.com |valor1@mail.com|valor1     |valor1  |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 |
   | valor 1|choosse a sport   |Tennis     |Golf      |https://www.valor1.com |valor1@mail.com|valor1     |valor1  |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 |
   Then Verifico que se presente Globo informativo de validación.
   
   
   
 @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      
      
      
      