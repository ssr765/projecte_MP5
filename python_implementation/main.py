"""Versió del projecte feta en Python.

Fet per:
    (Grup 2)
    - Yasmine Fadiss
    - Jessica Martinez
    - Sergi Serra
    - Arnau Vilalta
    - Iván Tovar
    - Pol Sanchez
    - Maximiliano Godoy
"""
from colorama import init, Fore

from heapsort import HeapSort


# Compatibilitat dels colors amb terminals Windows.
init(autoreset=True)


def demanar_numeros() -> list[int]:
    """Demana els numeros a l'usuari i verifica que siguin números enters
    correctes.
    
    Returns:
        list[int]: Llista amb els números introduits.
    """
    numeros = []

    # Bucle per demanar numeros.
    sortir = False
    while not sortir:
        # Demanar el número i comprovar si es vol sortir.
        try:
            numero = input("Introdueix un número ('sortir' per sortir): ")
            if numero.lower() != "sortir":
                numero = int(numero)

            else:
                sortir = True

        # Informar en cas que no sigui un número vàlid.
        except ValueError:
            print(Fore.RED + "Número no válid.")
        
        # Afegir el número a la llista.
        else:
            if not sortir:
                numeros.append(numero)

    return numeros

def main() -> None:
    """Funció principal del programa."""
    llista = demanar_numeros()
    hs = HeapSort(llista)
    hs.ordenar()
    print(llista)


if __name__ == "__main__":
    main()
