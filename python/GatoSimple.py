'''
Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
Este método debe comprobar que los gatos son de distinto sexo, tras lo
cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
= garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
programa desde el que se pruebe el método.

@author: Rafael Infante
'''

from random import randint


class GatoSimple:  # clase gato simple
    
    def __init__(self, s):  # constructor
        self.sexo = s
        self.color = ""
        self.raza = ""
        self.edad = 0
        self.peso = 0
    
    # getter
    def obtenersexo(self):
        return self.sexo
  
    '''
    metodo que hace que el gato maulle
    '''

    def maulla(self):
        print("Miauuu")
    
    '''
    metodo que hace que el gato ronronee
    '''

    def ronronea(self):
        print("mrrrrr")
  
    '''
    metodo que hace que el gato coma.
    A los gatos les gusta el pescado, si le damos otra comida
    la rechazará.
  
    '''  

    def come(self, comida):
        if comida == "pescado":
            print("hmmm gracias")
        else:
            print("Lo siento, yo solo como pescado")
  
    '''
    metodo que hace que se peleen los gatos
    @param: objeto tipo gato
    '''

    def peleaCon(self, contrincante):
        if (self.sexo == "hembra"):
            print("no me gusta pelear")
        else:
            if (contrincante.obtenersexo() == "hembra"):
                print("no peleo contra gatitas");
            else:
                print("ven aqui que te vas a enterar");

    '''
    metodo que hace que se apareen 2 gatos de distinto sexo.
    @param: objeto tipo gato
    @return: objeto tipo gato
    '''

    def apareaCon(self, pareja):
        s = ""
        # if (!this.sexo.equals(pareja.sexo)) {
        if self.sexo == pareja.sexo:
            #lanzar excepcion
            raise ValueError("No se pueden aparear son del mismo sexo.")
            #print("No se pueden aparear son del mismo sexo.")
            #raise apareamientoError()
        lista = ["macho", "hembra"]
        s = lista[randint(0, 1)]

        return GatoSimple(s)

    '''
    metodo toString
    '''

    def __str__(self):
        return "Gato [color=" + self.color + ", raza=" + self.raza + ", sexo=" + self.sexo + ", edad=" + str(self.edad) + ", peso=" + str(self.peso) + "]"

    '''
    garfield = GatoSimple("macho")
    tom = GatoSimple("macho")
    lisa = GatoSimple("hembra")
    maria = GatoSimple("hembra")
    lisa.peleaCon(maria)
    '''
