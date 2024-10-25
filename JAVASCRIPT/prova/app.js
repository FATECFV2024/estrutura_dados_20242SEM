let entrada = require('prompt-sync')()

let idades = new Array(5)

for (let i=0; i<idades.length; i++){
    idades[i]= entrada('Digite a idade: ')
}

console.log(idades)