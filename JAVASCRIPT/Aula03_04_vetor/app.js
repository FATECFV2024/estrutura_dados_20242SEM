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


let numeros = [1,2,3,4,5,6]
let dobra = numeros.map(x=> x*2)

console.log(dobra)

//exemplo de filter

let pares = numeros.filter(x=> x % 2 ==0)

console.log(pares)

let localiza_elemento = numeros.find(x=> x>2)
let localiza_index = numeros.findIndex(x=> x>2)

console.log("Foi localizado o elemento: "+localiza_elemento)
console.log("Foi localizado o index: "+localiza_index)


let maior = numeros.some(x=> x>2)

console.log("Atende a condição lógica: "+maior)

let r =  numeros.every(x=> x>0)
console.log("Todos atendem a regra: "+r)

// organizar os elementos
let n_aleatorio = [05,03,01,0,06,02,08,07]
console.log(n_aleatorio)
n_aleatorio.sort()
console.log(n_aleatorio)

n_aleatorio.reverse()
console.log(n_aleatorio)





//ternario (if-else simplificado em uma linha)
let nota = 6
let res = nota>=6  ? "Aprovado":"Reprovado"

console.log(res)
//ou
if (nota>=6){
    console.log("Aprovado")
}else{
    console.log("Reprovado")
}

// exemplo de funcao
function teste(t){
    console.log(t)
}

// teste('Francisco')