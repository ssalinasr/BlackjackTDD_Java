Feature: Repartidor juego 21

	Scenario Outline: Conocer el valor de una mano
		Given una mano "<mano>"
		When el repartidor sume las cartas
		Then el valor <valor> correcto
		
  Examples: manos y total
  	| mano         | valor |
  	| 5,7          | 12    |
  	| A,10,5       | 26    |
  	| J,K          | 20    |
  	| A,A,3        | 15    |
  	| J,K,8        | 28    |
  	| 8,1,K 	   | 19    |