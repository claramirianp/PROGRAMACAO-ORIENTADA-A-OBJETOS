Crie uma classe chamada SessaoCinema com a seguinte estrutura:
SessaoCinema
-numeroDaSala: int
-filme: String
-capacidade: int
-ingressosVendidos: int
-precoIngresso: Double

+SessaoCinema(numeroDaSala:int, filme: String, capacidade:int)
+SessaoCinema():Double
+venderIngressos(quantidade: int):Double
+venderIngressos(quantidade int, meiaEntrada: boolean):Double
+calcularBilheteria():Double
+exibirSessao():String
+exibirSessao(mostrarLotacao):String
