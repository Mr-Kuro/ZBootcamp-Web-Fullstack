//  APIs - são produzidas em 'json'

// fetch 
fetch(url, options)
    .then(response => response.json())
    .then
    (response => console.log(json))
    // retorna uma promisse


// exemplo 1
fetch('http://endereeco-api.com/', {
    method: 'GET',
    cache: 'no-cache',
})
    .then(response => response.json)
    .then(json => console.log(json))
    // retorna uma Promisse


// exemplo 2
fetch('http://endereeco-api.com/', {
    method: 'POST',
    cache: 'no-cache',
    body: JSON.stringify(data)
})
    .then(response => response.json)
    .then(json => console.log(json))
    // retorna uma Promisse