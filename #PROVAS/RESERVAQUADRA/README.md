Crie uma classe chamada ReservaQuadra com a seguinte estrutura:
ReservaQuadra
-numeroDaQuadra: int
-modalidade:String
-horaInicio: int
-duracao: int

+ReservaQuadra(numeroDaQuadra: int, modalidade: String, horaInicio: int, duracao: int)
+calcularValor():Double
+calcularValor(iluminacao: boolean):Double
+calcularValor(iluminacao: boolean, socio: boolean):Double
+exibirReserva(): String
+exibirReserva(mostrarDetalhes: boolean):String
