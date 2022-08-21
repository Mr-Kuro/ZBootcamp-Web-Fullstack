let valorAny: any;
 valorAny = 3;
 valorAny = 'olá';
 valorAny = true;

 let valorString: string = 'teste';
 valorString = valorAny;

 let valorString2: string = 'testão';
 valorString2 = valorAny;

 function SomaStrings(str1:string, str2:string){
    console.log(str1 + str2)
 }

 SomaStrings(valorString, valorString2)
 SomaStrings('olá ', 'mundo!')