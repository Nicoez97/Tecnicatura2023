class FiguraGeometrica:
    def __init__(self ,ancho, alto):
        self._ancho = ancho
        self._alto = alto

    @property
    def ancho (self):
        return self. _ancho
    
    @ancho.setter
    def alto(self):
        return self._alto
    
    @property
    def alto(self):
        return self._alto
    
    @alto.setter
    def alto(self,alto):
        self._alto=alto
    
    def __srt__(self):
        return f'FiguraGeometrica [Ancho: {self._ancho},Alto:{self._alto}]'

