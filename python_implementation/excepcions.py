"""Excepcions que utilitza la nostre imprementació del HeapSort."""
class LlistaBuida(Exception):
    """Excepció que afloreix quan la llista es buida."""
    def __init__(self, missatge: str = "La llista es buida.") -> None:
        super().__init__(missatge)

class NoEsLLista(Exception):
    """Excepció que afloreix quan la llista no es de tipus list."""
    def __init__(
            self, missatge: str = "El parametre passat no és una llista."
        ) -> None:
        super().__init__(missatge)

class ValorsNoNumerics(Exception):
    """Excepció que afloreix quan hi ha algún valor no numèric a la llista."""
    def __init__(
            self,
            missatge: str = "La llista només pot contenir valors numèrics."
        ) -> None:
        super().__init__(missatge)
