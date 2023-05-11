"""Implementació del HeapSort en Python."""
from excepcions import LlistaBuida, NoEsLLista, ValorsNoNumerics

from colorama import init, Fore


init(autoreset=True)


class HeapSort:
    """Representra el HeapSort que ordenarà la llista."""
    def __init__(self, llista: list) -> None:
        # Comprovar que el valor passat sigui una llista.
        if not isinstance(llista, list):
            raise NoEsLLista

        # Comprovar que tots els valors de la llista.
        for x in llista:
            if not isinstance(x, int):
                raise ValorsNoNumerics
        
        # Comprovar que la llista no sigui buida.
        if len(llista) == 0:
            raise LlistaBuida

        self.llista = llista

    def ordenar(self) -> None:
        """Ordena la llista."""
        num_nodes = len(self.llista)

        print(Fore.CYAN + "Buscant nombre més gran.")

        # Trobar i pujar el número més gran.
        for i in range(num_nodes // 2, -1, -1):
            self.heapify(num_nodes, i)

        print(Fore.CYAN + "Fi del primer bucle.")
        print(Fore.CYAN + f"El número més gran es {self.llista[0]}.")

        # Pujar els nombres restants i ordenar-los.
        for i in range(num_nodes - 1, 0, -1):
            self.intercanvi(i, 0)
            self.heapify(i, 0)
        
        print(Fore.CYAN + "Llista ordenada.")

    def heapify(self, num_nodes: int, node_actual: int) -> None:
        """'heapify' es la funció cridada per 'odernar' que fa la comparació
        del node passat per parametre i dels seus nodes inferiors.
        
        Args:
            num_nodes (int): Nombre de nodes restants al arbre.
            node_actual (int): Node a comparar.
        """
        print(Fore.GREEN + f"Inici del Heapify pel node {node_actual}.")
        major = node_actual
        esquerra = 2 * node_actual + 1
        dreta = 2 * node_actual + 2

        # En cas que hi hagi un node inferior esquerra, comprovar si el node
        # esquerra es més petit que el node actual.
        if (
            esquerra < num_nodes
            and self.llista[node_actual] < self.llista[esquerra]
        ):
            print(Fore.MAGENTA + "El node esquerra passa a ser el major.")
            major = esquerra

        # En cas que hi hagi un node inferior dreta, comprovar si el node major
        # es més petit que el node dreta.
        if dreta < num_nodes and self.llista[major] < self.llista[dreta]:
            print(Fore.MAGENTA + "El node dret passa a ser el major.")
            major = dreta

        # Si el node_actual ha deixat de ser el més gran, es canvien i es
        # continua fent Heapify recursivament.
        if major != node_actual:
            print("Canviant el node per el número major.")
            self.intercanvi(node_actual, major)
            self.heapify(num_nodes, major)
        
        else:
            print("El número major no ha canviat. No es fa res.")
        
        print(Fore.GREEN + "Final del Heapify.")

    def intercanvi(self, x: int, y: int) -> None:
        """Fa un intercanvi entre dos index de la llista.

        Args:
            x (int): Primer index.
            y (int): Segón index.
        """
        print(
            f"Intercanvi del node {x} (valor: {self.llista[x]}) amb"
            + f" el node {y} (valor: {self.llista[y]})"
        )
        self.llista[x], self.llista[y] = self.llista[y], self.llista[x]
