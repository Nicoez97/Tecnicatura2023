"""Ejercicio11 : Agenda telefonica
hacer un programa que simule una agneda de contacto,Crear un
diccionario donde la clave sea el nombre del usuario y el valor
sea el telefono,el programa tendra el siguiente menu de opciones:
        1.Nuevo contacto
        2.Borrar contacto
        3.Ver contactos existentes
        4.salir"""

agenda={}
while True:
    print("\t.:MENÚ:.")
    print("1.Nuevo contacto")
    print("2.Borrar contacto")
    print("3.Ver contactos existentes")
    print("4.Salir")
    opcion=int(input("Digite una opcion de menu: "))
    if opcion==1:
        nombre=input("Digite el nombre del contacto: ")
        telefono=input("Digite el numero de telefono: ")
        if nombre not in agenda:
            agenda[nombre]= telefono
            print("Contacto agregado exitosamente!")
        else:
            print("Este nombre de contacto ya existe")
    elif opcion==2:
        nombre=input("Cual es el nombre del contacto:")
        if nombre in agenda:
            del(agenda[nombre])
        