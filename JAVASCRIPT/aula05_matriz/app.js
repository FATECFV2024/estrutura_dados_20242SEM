//declarando matriz vazia
let minha_matriz = [[], []]

let minha_matriz2 = []

//declarando e inicializando a matriz

let minha_matriz3 = [[1, 2], [3, 4], [5, 6]] //3x2 -- numeros inteiro

// console.log(minha_matriz3)

//matriz mista

let obj = { "nome": "Diego", "idade": 30 }
let matriz_mista = [["Francisco", "25"], [1, 10.5], [true, false], [null, obj]] //4x2 - mista
// console.log(matriz_mista)

//acessando valores

//[linha][coluna]
console.log(minha_matriz3[2][1]) //ultimo elemento nesse exemplo
// console.log(minha_matriz3[0][0]) //Primeiro elemento

//acessando mais de uma matriz dentro do console.log
// console.log(minha_matriz3[2][1]+" "+minha_matriz3[2][0])

//matriz com quantidade de colunas diferentes
let minha_matriz_tam_diff = [[1], [2, 3, 4, 5, 6], [7, 8, 9, 10, 11], [12, 13], [14]]
// console.log(minha_matriz_tam_diff)

//verificar o tamanho da matriz
let qtd_linhas = minha_matriz_tam_diff.length
// console.log(qtd_linhas)

let qtd_colunas = minha_matriz_tam_diff[1].length
// console.log(qtd_colunas)

//adicionar elementos na matriz apos a sua criação
let minha_matriz4 = [[1, 2], [3, 4]] //2x2

minha_matriz4.splice(2, 0, [5]) //adicionando uma linha no meio da matriz -3x2

minha_matriz4.splice(3, 0, [6, 7, 8]) //adicionando uma linha no fim da matriz -4x3

minha_matriz4.push([9, 10]) //fim da matriz --5x3


//adicionando elementos para uma linha especifica
minha_matriz4[0].push(0)
minha_matriz4[4].push(11)

// console.log(minha_matriz4)
console.log(minha_matriz4)
//removendo uma determinada linha da matriz
minha_matriz4.splice(0, 1)
console.log("original:")
console.log(minha_matriz4)

//removendo a ultima linha da matriz
minha_matriz4.pop() //9,10,11
console.log(minha_matriz4)

//removendo o ultimo  elemento da linha da matriz
minha_matriz4[0].pop() // da linha 0 removeu o elemento 4
console.log(minha_matriz4)

//removendo o elemento de uma determinada linha da matriz
minha_matriz4[2].splice(2, 1)
console.log(minha_matriz4)

//interando uma matriz 
// l = linha
for (let l = 0; l < minha_matriz4.length; l++) {
    for(let c = 0; c<minha_matriz4[l].length; c++){
        console.log(minha_matriz4[l][c]+"")
    }
}


