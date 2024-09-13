let modelos = ['Gol','Corsa', 'Fusca']

let marcas = Array('Chevrolet','Fiat','Ford')

let acessorios = new Array(5)

let cores = []

let categoria = new Array()


console.log(modelos)
console.log(marcas)
console.log(acessorios)
console.log(cores)
console.log(categoria)

// Adcionando elementos
modelos.push('HB20')
console.log(modelos)

modelos.unshift('Logan')
console.log(modelos)

// Removendo elementos
modelos.pop()
console.log(modelos)

modelos.shift()
console.log(modelos)

// Juntando (ou Unindo) Arrays
let frutas = ['Laranja','Melância','Morango','Uva','Caju']
let vegetais = ['Batata doce','Cenoura','Milho']

let feira = frutas.concat(vegetais)

console.log(feira)

// Recortando uma parte da Array
let frutas_sel = frutas.slice(1,3)

let frutas_sel2 = frutas.slice(1,1,'Manga')

console.log(frutas_sel)
console.log(frutas_sel2)

let existe = frutas_sel.includes('Morango')
console.log(existe)

// Unificando como texto puro
let texto = frutas.join(',')
console.log(texto)
