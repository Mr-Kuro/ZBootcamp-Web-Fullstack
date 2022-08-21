// promisse
const myPromise = new Promise((resolve, reject) => {
    window.setTimeout(() => {
        resolve(console.log('Resolvida!'));
    }, 2000);
});


//async - define funções assincronas

// é necessário usar await na função assíncrona para receber o resultado

async function resolvePromised() {
    const myPromise = new Promise((resolve, reject) => {
        window.setTimeout(() => {
            resolve('resolvida')
        }, 3000);
    })


    const resolved = await myPromise
            .then((result) => result + ' passando pela then')
            .then((result) => result + ' e agora acabou!')
            .catch((err) => console.log(err.message));
    
    return resolved;
};

const bee =  resolvePromised();


// usando o try...catch

// async function resolvePromised() {
//     const myPromise = new Promise((resolve, reject) => {
//         window.setTimeout(() => {
//             resolve('resolvida')
//         }, 3000);
//     })

//     let result;

//     try {
//         result = await myPromise
//             .then((result) => result + ' passando pelo then')
//             .then((result) => + ' e agora acabou!')
//     } catch (error) {
//         result = error.message;
//     };

//     return result
// };