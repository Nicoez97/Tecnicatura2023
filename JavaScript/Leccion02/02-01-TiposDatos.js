//Tipos de datos de javascrips
/*
La sintaxis en los comentarios
es muy similiar a la de Java
realmente diriamos identica
*/
var nombre= "Ariel"; //Tipo str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre= 12.3;
console.log(typeof nombre);
var numerico = 3000;//Tipo numerico
console.log(numerico);

var objeto={
    nombre :'Ariel',
    apellido : 'Betacund',
    telefono : '261254538'

}
console.log( objeto);

//Tipo de dato booleano
var bandera = true;
console.log(typeof bandera);

//Tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de Dato synbol

var simbolo= Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de Dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);
